package iiec.androidterm;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.a;
import iiec.androidterm.TermService;
import iiec.androidterm.r.m;
import iiec.androidterm.r.s;
import java.io.IOException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

public class Term extends androidx.appcompat.app.e implements s, SharedPreferences.OnSharedPreferenceChangeListener {
    private static final int O = i.view_flipper;
    private boolean A;
    private int B = 0;
    private BroadcastReceiver C = new a();
    private TermService D;
    private ServiceConnection E = new b();
    private androidx.appcompat.app.a F;
    private int G = 0;
    private q H;
    private e I;
    private m.a.a.b J;
    private boolean K;
    private boolean L;
    private View.OnKeyListener M;
    private BroadcastReceiver N;
    private TermViewFlipper q;
    private iiec.androidterm.t.a r;
    private iiec.androidterm.t.c s;
    private boolean t = false;
    private boolean u = false;
    private Intent v;
    private int w = -1;
    private ComponentName x;
    private PowerManager.WakeLock y;
    private WifiManager.WifiLock z;

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            String a2 = Term.this.a((Term) getResultExtras(false));
            if (intent.getAction().equals("iiec.androidterm.broadcast.PREPEND_TO_PATH")) {
                Term.this.s.b(a2);
            } else {
                Term.this.s.a(a2);
            }
            Term.g(Term.this);
            if (Term.this.B <= 0 && Term.this.D != null) {
                Term.this.J();
                Term.this.K();
            }
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.i("Term", "Bound to TermService");
            Term.this.D = ((TermService.d) iBinder).a();
            if (Term.this.B <= 0) {
                Term.this.J();
                Term.this.K();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Term.this.D = null;
        }
    }

    class c implements a.c {
        c(Term term) {
        }
    }

    class d implements View.OnKeyListener {
        d() {
        }

        private boolean a(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || Term.this.G != 2 || Term.this.F == null || !Term.this.F.k()) {
                return false;
            }
            Term.this.onKeyUp(i2, keyEvent);
            return true;
        }

        private boolean b(int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || !Term.this.L) {
                return false;
            }
            boolean z = (keyEvent.getMetaState() & 4096) != 0;
            boolean z2 = (keyEvent.getMetaState() & 1) != 0;
            if (i2 == 61 && z) {
                TermViewFlipper termViewFlipper = Term.this.q;
                if (z2) {
                    termViewFlipper.showPrevious();
                } else {
                    termViewFlipper.showNext();
                }
                return true;
            } else if (i2 == 42 && z && z2) {
                Term.this.w();
                return true;
            } else if (i2 != 50 || !z || !z2) {
                return false;
            } else {
                Term.this.y();
                return true;
            }
        }

        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            return a(i2, keyEvent) || b(i2, keyEvent);
        }
    }

    class e extends BroadcastReceiver {
        e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (Term.this.D != null) {
                Term.this.D.b();
            }
        }
    }

    class f extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IBinder f9240b;

        f(IBinder iBinder) {
            this.f9240b = iBinder;
        }

        public void run() {
            ((InputMethodManager) Term.this.getSystemService("input_method")).hideSoftInputFromWindow(this.f9240b, 0);
        }
    }

    /* access modifiers changed from: private */
    public class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b  reason: collision with root package name */
        private iiec.androidterm.r.e f9242b;

        public g(iiec.androidterm.r.e eVar) {
            this.f9242b = eVar;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (((double) Math.abs(f2)) <= Math.max(1000.0d, ((double) Math.abs(f3)) * 2.0d)) {
                return false;
            }
            if (f2 > 0.0f) {
                Term.this.q.showPrevious();
                return true;
            }
            Term.this.q.showNext();
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (this.f9242b.a()) {
                return false;
            }
            String a = this.f9242b.a(motionEvent.getX(), motionEvent.getY());
            if (a != null) {
                Term.this.a((Term) a);
                return true;
            }
            Term.this.a((Term) ((int) motionEvent.getX()), (int) motionEvent.getY(), this.f9242b.getVisibleWidth(), this.f9242b.getVisibleHeight());
            return true;
        }
    }

    public Term() {
        new c(this);
        this.K = false;
        this.M = new d();
        new Handler();
        this.N = new e();
    }

    private void A() {
        H().d();
    }

    private void B() {
        H().e();
    }

    private void C() {
        m I2 = I();
        if (I2 != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", I2.d().trim());
            intent.setType("text/plain");
            startActivity(intent);
        }
    }

    private void D() {
        androidx.appcompat.app.a aVar = this.F;
        if (aVar != null) {
            if (aVar.k()) {
                aVar.i();
            } else {
                aVar.n();
            }
        }
    }

    private void E() {
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    private void F() {
        if (this.y.isHeld()) {
            this.y.release();
        } else {
            this.y.acquire();
        }
        invalidateOptionsMenu();
    }

    private void G() {
        if (this.z.isHeld()) {
            this.z.release();
        } else {
            this.z.acquire();
        }
        invalidateOptionsMenu();
    }

    private iiec.androidterm.r.e H() {
        return (iiec.androidterm.r.e) this.q.getCurrentView();
    }

    private m I() {
        iiec.androidterm.t.a aVar = this.r;
        if (aVar == null) {
            return null;
        }
        return (m) aVar.get(this.q.getDisplayedChild());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void J() {
        TermService termService = this.D;
        if (termService != null) {
            this.r = termService.a();
            if (this.r.size() == 0) {
                try {
                    this.r.add(t());
                } catch (IOException unused) {
                    Toast.makeText(this, "Failed to start terminal session", 1).show();
                    finish();
                    return;
                }
            }
            this.r.a(this);
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                this.q.addView(a((m) it.next()));
            }
            M();
            int i2 = this.w;
            if (i2 >= 0) {
                this.q.setDisplayedChild(i2);
                this.w = -1;
            }
            this.q.b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void K() {
    }

    private void L() {
        startActivity(getIntent());
        finish();
    }

    private void M() {
        androidx.appcompat.app.a aVar;
        this.L = this.s.w();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.q.a(this.s);
        Iterator<View> it = this.q.iterator();
        while (it.hasNext()) {
            View next = it.next();
            ((iiec.androidterm.r.e) next).setDensity(displayMetrics);
            ((p) next).a(this.s);
        }
        iiec.androidterm.t.a aVar2 = this.r;
        if (aVar2 != null) {
            Iterator it2 = aVar2.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).a(this.s);
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i2 = 0;
        int i3 = this.s.x() ? 0 : 1024;
        if (i3 != (attributes.flags & 1024) || (iiec.androidterm.compat.a.a >= 11 && this.G != this.s.a())) {
            if (this.t) {
                L();
            } else {
                window.setFlags(i3, 1024);
                if (this.G == 2 && (aVar = this.F) != null) {
                    aVar.i();
                }
            }
        }
        int t2 = this.s.t();
        if (t2 == 0) {
            i2 = -1;
        } else if (t2 != 1 && t2 == 2) {
            i2 = 1;
        }
        setRequestedOrientation(i2);
    }

    private p a(m mVar) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        p pVar = new p(this, mVar, displayMetrics);
        pVar.setExtGestureListener(new g(pVar));
        pVar.setOnKeyListener(this.M);
        registerForContextMenu(pVar);
        return pVar;
    }

    protected static m a(Context context, iiec.androidterm.t.c cVar, String str) {
        o oVar = new o(cVar, str);
        oVar.e(context.getString(m.process_exit_message));
        return oVar;
    }

    private String a(int i2, int i3, Resources resources, int i4, int i5, int i6, String str) {
        if (i2 == i3) {
            return resources.getString(i6);
        }
        return resources.getString(i5).replaceAll(str, resources.getStringArray(i4)[i2]);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String a(Bundle bundle) {
        if (bundle == null || bundle.size() == 0) {
            return "";
        }
        String[] strArr = (String[]) bundle.keySet().toArray(new String[bundle.size()]);
        Arrays.sort(strArr, Collator.getInstance(Locale.US));
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            String string = bundle.getString(str);
            if (string != null && !string.equals("")) {
                sb.append(string);
                sb.append(":");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r1.K == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            int r2 = r1.G
            r4 = 2
            if (r2 == 0) goto L_0x001b
            r0 = 1
            if (r2 == r0) goto L_0x0016
            if (r2 == r4) goto L_0x000b
            goto L_0x002f
        L_0x000b:
            boolean r2 = r1.K
            if (r2 != 0) goto L_0x0012
            int r5 = r5 / r4
            if (r3 >= r5) goto L_0x002c
        L_0x0012:
            r1.D()
            return
        L_0x0016:
            boolean r2 = r1.K
            if (r2 != 0) goto L_0x002f
            goto L_0x002c
        L_0x001b:
            int r2 = iiec.androidterm.compat.a.a
            r0 = 11
            if (r2 < r0) goto L_0x002c
            boolean r2 = r1.K
            if (r2 != 0) goto L_0x0028
            int r5 = r5 / r4
            if (r3 >= r5) goto L_0x002c
        L_0x0028:
            r1.openOptionsMenu()
            return
        L_0x002c:
            r1.E()
        L_0x002f:
            iiec.androidterm.r.e r2 = r1.H()
            r2.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.Term.a(int, int, int, int):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            startActivity(intent);
        }
    }

    private boolean a(Configuration configuration) {
        return configuration.keyboard == 2 && configuration.hardKeyboardHidden == 1;
    }

    static /* synthetic */ int g(Term term) {
        int i2 = term.B;
        term.B = i2 - 1;
        return i2;
    }

    private boolean s() {
        return iiec.androidterm.r.t.e.a(getApplicationContext()).a();
    }

    private m t() {
        iiec.androidterm.t.c cVar = this.s;
        m a2 = a(this, cVar, cVar.q());
        a2.a(this.D);
        return a2;
    }

    private void u() {
        iiec.androidterm.r.e H2;
        if (this.r != null && (H2 = H()) != null) {
            m remove = this.r.remove(this.q.getDisplayedChild());
            H2.b();
            remove.a();
            this.q.removeView(H2);
            if (this.r.size() != 0) {
                this.q.showNext();
            }
        }
    }

    private void v() {
        iiec.androidterm.r.t.e.a(getApplicationContext()).a(I().d().trim());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void w() {
        if (this.r == null) {
            Log.w("Term", "Couldn't create new window because mTermSessions == null");
            return;
        }
        try {
            m t2 = t();
            this.r.add(t2);
            p a2 = a(t2);
            a2.a(this.s);
            this.q.addView(a2);
            this.q.setDisplayedChild(this.q.getChildCount() - 1);
        } catch (IOException unused) {
            Toast.makeText(this, "Failed to create a session", 0).show();
        }
    }

    private void x() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        Resources resources = getResources();
        builder.setTitle(resources.getString(m.control_key_dialog_title));
        builder.setMessage(a(this.s.k(), 7, resources, f.control_keys_short_names, m.control_key_dialog_control_text, m.control_key_dialog_control_disabled_text, "CTRLKEY") + "\n\n" + a(this.s.n(), 7, resources, f.fn_keys_short_names, m.control_key_dialog_fn_text, m.control_key_dialog_fn_disabled_text, "FNKEY"));
        builder.show();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void y() {
        if (s()) {
            I().b(iiec.androidterm.r.t.e.a(getApplicationContext()).v().toString());
        }
    }

    private void z() {
        startActivity(new Intent(this, TermPreferences.class));
    }

    @Override // iiec.androidterm.r.s
    public void b() {
        iiec.androidterm.t.a aVar = this.r;
        if (aVar != null) {
            if (aVar.size() == 0) {
                this.u = true;
                finish();
            } else if (aVar.size() < this.q.getChildCount()) {
                int i2 = 0;
                while (i2 < this.q.getChildCount()) {
                    iiec.androidterm.r.e eVar = (iiec.androidterm.r.e) this.q.getChildAt(i2);
                    if (!aVar.contains(eVar.getTermSession())) {
                        eVar.b();
                        this.q.removeView(eVar);
                        i2--;
                    }
                    i2++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        m.a.a.b bVar = this.J;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
        if (i2 == 1) {
            if (i3 != -1 || intent == null) {
                iiec.androidterm.t.a aVar = this.r;
                if (aVar == null || aVar.size() == 0) {
                    this.u = true;
                    finish();
                    return;
                }
                return;
            }
            int intExtra = intent.getIntExtra("iiec.androidterm.window_id", -2);
            if (intExtra >= 0) {
                this.w = intExtra;
            } else if (intExtra == -1) {
                w();
                this.w = this.r.size() - 1;
            }
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.e
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.K = a(configuration);
        iiec.androidterm.r.e eVar = (iiec.androidterm.r.e) this.q.getCurrentView();
        if (eVar != null) {
            eVar.a(false);
        }
        q qVar = this.H;
        if (qVar != null) {
            qVar.notifyDataSetChanged();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            H().f();
            return true;
        } else if (itemId == 1) {
            v();
            return true;
        } else if (itemId == 2) {
            y();
            return true;
        } else if (itemId == 3) {
            A();
            return true;
        } else if (itemId != 4) {
            return super.onContextItemSelected(menuItem);
        } else {
            B();
            return true;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f
    @TargetApi(21)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.J = new m.a.a.b(this);
        Log.v("Term", "onCreate");
        this.x = new ComponentName(this, "iiec.androidterm.TermInternal");
        if (bundle == null) {
            onNewIntent(getIntent());
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.s = new iiec.androidterm.t.c(getResources(), defaultSharedPreferences);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Intent intent = new Intent("iiec.androidterm.broadcast.APPEND_TO_PATH");
        if (iiec.androidterm.compat.a.a >= 12) {
            intent.addFlags(32);
        }
        this.B++;
        sendOrderedBroadcast(intent, "iiec.androidterm.permission.APPEND_TO_PATH", this.C, null, -1, null, null);
        Intent intent2 = new Intent(intent);
        intent2.setAction("iiec.androidterm.broadcast.PREPEND_TO_PATH");
        this.B++;
        sendOrderedBroadcast(intent2, "iiec.androidterm.permission.PREPEND_TO_PATH", this.C, null, -1, null, null);
        this.v = new Intent(this, TermService.class);
        startService(this.v);
        this.G = 1;
        setContentView(k.term_activity);
        this.q = (TermViewFlipper) findViewById(O);
        LinearLayout linearLayout = (LinearLayout) findViewById(i.PDB_layout);
        linearLayout.setVisibility(8);
        this.I = new e(this, linearLayout);
        this.I.a();
        registerReceiver(this.N, new IntentFilter(getApplicationContext().getPackageName() + ".GET_FOREGROUND"));
        this.y = ((PowerManager) getSystemService("power")).newWakeLock(536870918, "Term");
        this.z = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(iiec.androidterm.compat.a.a >= 12 ? 3 : 1, "Term");
        androidx.appcompat.app.a p = p();
        if (p != null) {
            this.F = p;
            try {
                this.F.d(true);
            } catch (Exception unused) {
            }
            p.a(0, 8);
            if (this.G == 2) {
                p.i();
            }
        }
        this.K = a(getResources().getConfiguration());
        M();
        this.t = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle(m.edit_text);
        contextMenu.add(0, 0, 0, m.select_text);
        contextMenu.add(0, 1, 0, m.copy_all);
        contextMenu.add(0, 2, 0, m.paste);
        contextMenu.add(0, 3, 0, m.send_control_key);
        contextMenu.add(0, 4, 0, m.send_fn_key);
        if (!s()) {
            contextMenu.getItem(2).setEnabled(false);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(l.main1, menu);
        return true;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.e
    public void onDestroy() {
        super.onDestroy();
        this.J.a();
        PreferenceManager.getDefaultSharedPreferences(this).unregisterOnSharedPreferenceChangeListener(this);
        if (this.u) {
            stopService(this.v);
        }
        this.D = null;
        this.E = null;
        if (this.y.isHeld()) {
            this.y.release();
        }
        if (this.z.isHeld()) {
            this.z.release();
        }
        unregisterReceiver(this.N);
    }

    @Override // androidx.appcompat.app.e
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (iiec.androidterm.compat.a.a >= 5 || i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.A = true;
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVar;
        if (i2 == 4) {
            if (iiec.androidterm.compat.a.a < 5) {
                if (!this.A) {
                    return false;
                }
                this.A = false;
            }
            if (this.G != 2 || (aVar = this.F) == null || !aVar.k()) {
                int g2 = this.s.g();
                if (g2 == 0) {
                    this.u = true;
                } else if (g2 == 1) {
                    u();
                    return true;
                } else if (g2 != 2) {
                    return false;
                }
                finish();
                return true;
            }
            this.F.i();
            return true;
        } else if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        } else {
            androidx.appcompat.app.a aVar2 = this.F;
            if (aVar2 == null || aVar2.k()) {
                return super.onKeyUp(i2, keyEvent);
            }
            this.F.n();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    @Override // androidx.fragment.app.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r6) {
        /*
            r5 = this;
            int r0 = r6.getFlags()
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = r6.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x005a
            android.content.ComponentName r1 = r5.x
            android.content.ComponentName r2 = r6.getComponent()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0021
            goto L_0x005a
        L_0x0021:
            int r1 = r0.hashCode()
            r2 = -1906578515(0xffffffff8e5bebad, float:-2.7107308E-30)
            r3 = 1
            r4 = -1
            if (r1 == r2) goto L_0x003c
            r2 = 2039411830(0x798ef476, float:9.278305E34)
            if (r1 == r2) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            java.lang.String r1 = "iiec.androidterm.private.OPEN_NEW_WINDOW"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            goto L_0x0047
        L_0x003c:
            java.lang.String r1 = "iiec.androidterm.private.SWITCH_WINDOW"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = -1
        L_0x0047:
            if (r0 == 0) goto L_0x0055
            if (r0 == r3) goto L_0x004c
            goto L_0x005a
        L_0x004c:
            java.lang.String r0 = "iiec.androidterm.private.target_window"
            int r6 = r6.getIntExtra(r0, r4)
            if (r6 < 0) goto L_0x005a
            goto L_0x0058
        L_0x0055:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0058:
            r5.w = r6
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.Term.onNewIntent(android.content.Intent):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        androidx.appcompat.app.a aVar;
        int itemId = menuItem.getItemId();
        if (itemId == i.menu_preferences) {
            z();
        } else if (itemId == i.action_run_foreground) {
            TermService termService = this.D;
            if (termService != null) {
                termService.b();
                moveTaskToBack(true);
            }
        } else if (itemId == i.menu_send_email) {
            C();
        } else if (itemId == i.action_press_tab) {
            try {
                ((m) this.r.get(0)).b("\t");
            } catch (Exception unused) {
            }
        } else if (itemId == i.menu_special_keys) {
            x();
        } else if (itemId == i.menu_toggle_soft_keyboard) {
            E();
        } else if (itemId == i.menu_toggle_wakelock) {
            F();
        } else if (itemId == i.menu_toggle_wifilock) {
            G();
        } else if (itemId == 16908332) {
            if (iiec.androidterm.compat.a.a < 5) {
                if (!this.A) {
                    return false;
                }
                this.A = false;
            }
            if (this.G != 2 || (aVar = this.F) == null || !aVar.k()) {
                int g2 = this.s.g();
                if (g2 == 0) {
                    this.u = true;
                } else if (g2 == 1) {
                    u();
                    return true;
                } else if (g2 != 2) {
                    return false;
                }
                finish();
                return true;
            }
            this.F.i();
            return true;
        }
        if (this.G == 2) {
            this.F.i();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        super.onPause();
        if (iiec.androidterm.compat.a.a < 5) {
            this.A = false;
        }
        new f(this.q.getWindowToken()).start();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.e
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(i.menu_toggle_wakelock);
        MenuItem findItem2 = menu.findItem(i.menu_toggle_wifilock);
        findItem.setTitle(this.y.isHeld() ? m.disable_wakelock : m.enable_wakelock);
        findItem2.setTitle(this.z.isHeld() ? m.disable_wifilock : m.enable_wifilock);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.s.a(sharedPreferences);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.appcompat.app.e
    public void onStart() {
        super.onStart();
        if (!bindService(this.v, this.E, 1)) {
            throw new IllegalStateException("Failed to bind to TermService!");
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.appcompat.app.e
    public void onStop() {
        this.q.a();
        iiec.androidterm.t.a aVar = this.r;
        if (aVar != null) {
            aVar.c(this);
            q qVar = this.H;
            if (qVar != null) {
                this.r.c(qVar);
                this.r.d(this.H);
                this.q.a(this.H);
            }
        }
        this.q.removeAllViews();
        unbindService(this.E);
        super.onStop();
    }
}
