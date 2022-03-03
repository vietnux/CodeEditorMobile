package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import androidx.core.widget.NestedScrollView;
import c.a.j;
import c.h.l.b0;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    final i f114b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f115c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f117e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f118f;

    /* renamed from: g  reason: collision with root package name */
    ListView f119g;

    /* renamed from: h  reason: collision with root package name */
    private View f120h;

    /* renamed from: i  reason: collision with root package name */
    private int f121i;

    /* renamed from: j  reason: collision with root package name */
    private int f122j;

    /* renamed from: k  reason: collision with root package name */
    private int f123k;

    /* renamed from: l  reason: collision with root package name */
    private int f124l;

    /* renamed from: m  reason: collision with root package name */
    private int f125m;
    private boolean n = false;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;

    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        private final int f126b;

        /* renamed from: c  reason: collision with root package name */
        private final int f127c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.RecycleListView);
            this.f127c = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
            this.f126b = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
        }

        public void a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f126b, getPaddingRight(), z2 ? getPaddingBottom() : this.f127c);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.i r3 = r3.f114b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements NestedScrollView.b {
        final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f129b;

        b(AlertController alertController, View view, View view2) {
            this.a = view;
            this.f129b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.a(nestedScrollView, this.a, this.f129b);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f130b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f131c;

        c(View view, View view2) {
            this.f130b = view;
            this.f131c = view2;
        }

        public void run() {
            AlertController.a(AlertController.this.A, this.f130b, this.f131c);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements AbsListView.OnScrollListener {
        final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f133b;

        d(AlertController alertController, View view, View view2) {
            this.a = view;
            this.f133b = view2;
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.a(absListView, this.a, this.f133b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f134b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f135c;

        e(View view, View view2) {
            this.f134b = view;
            this.f135c = view2;
        }

        public void run() {
            AlertController.a(AlertController.this.f119g, this.f134b, this.f135c);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f137b;

        /* renamed from: c  reason: collision with root package name */
        public int f138c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f139d;

        /* renamed from: e  reason: collision with root package name */
        public int f140e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f141f;

        /* renamed from: g  reason: collision with root package name */
        public View f142g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f143h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f144i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f145j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f146k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f147l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f148m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        /* access modifiers changed from: package-private */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecycleListView f149b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f149b = recycleListView;
            }

            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i2]) {
                    this.f149b.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends CursorAdapter {

            /* renamed from: b  reason: collision with root package name */
            private final int f151b;

            /* renamed from: c  reason: collision with root package name */
            private final int f152c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ RecycleListView f153d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AlertController f154e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f153d = recycleListView;
                this.f154e = alertController;
                Cursor cursor2 = getCursor();
                this.f151b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f152c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f151b));
                RecycleListView recycleListView = this.f153d;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f152c) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f137b.inflate(this.f154e.M, viewGroup, false);
            }
        }

        /* access modifiers changed from: package-private */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f156b;

            c(AlertController alertController) {
                this.f156b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                f.this.x.onClick(this.f156b.f114b, i2);
                if (!f.this.H) {
                    this.f156b.f114b.dismiss();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecycleListView f158b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AlertController f159c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f158b = recycleListView;
                this.f159c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i2] = this.f158b.isItemChecked(i2);
                }
                f.this.J.onClick(this.f159c.f114b, i2, this.f158b.isItemChecked(i2));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.a = context;
            this.r = true;
            this.f137b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r12) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f142g;
            if (view != null) {
                alertController.a(view);
            } else {
                CharSequence charSequence = this.f141f;
                if (charSequence != null) {
                    alertController.b(charSequence);
                }
                Drawable drawable = this.f139d;
                if (drawable != null) {
                    alertController.a(drawable);
                }
                int i2 = this.f138c;
                if (i2 != 0) {
                    alertController.b(i2);
                }
                int i3 = this.f140e;
                if (i3 != 0) {
                    alertController.b(alertController.a(i3));
                }
            }
            CharSequence charSequence2 = this.f143h;
            if (charSequence2 != null) {
                alertController.a(charSequence2);
            }
            if (!(this.f144i == null && this.f145j == null)) {
                alertController.a(-1, this.f144i, this.f146k, (Message) null, this.f145j);
            }
            if (!(this.f147l == null && this.f148m == null)) {
                alertController.a(-2, this.f147l, this.n, (Message) null, this.f148m);
            }
            if (!(this.o == null && this.p == null)) {
                alertController.a(-3, this.o, this.q, (Message) null, this.p);
            }
            if (!(this.v == null && this.K == null && this.w == null)) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 == null) {
                int i4 = this.y;
                if (i4 != 0) {
                    alertController.c(i4);
                }
            } else if (this.E) {
                alertController.a(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.b(view2);
            }
        }
    }

    private static final class g extends Handler {
        private WeakReference<DialogInterface> a;

        public g(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, i iVar, Window window) {
        this.a = context;
        this.f114b = iVar;
        this.f115c = window;
        this.R = new g(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.AlertDialog, c.a.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.AlertDialog_android_layout, 0);
        this.K = obtainStyledAttributes.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(j.AlertDialog_listLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
        this.O = obtainStyledAttributes.getResourceId(j.AlertDialog_listItemLayout, 0);
        this.P = obtainStyledAttributes.getBoolean(j.AlertDialog_showTitle, true);
        this.f116d = obtainStyledAttributes.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        iVar.a(1);
    }

    private ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void a(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    private void a(ViewGroup viewGroup) {
        boolean z2;
        Button button;
        this.o = (Button) viewGroup.findViewById(16908313);
        this.o.setOnClickListener(this.S);
        boolean z3 = true;
        if (!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i2 = this.f116d;
                drawable.setBounds(0, 0, i2, i2);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            z2 = true;
        } else {
            this.o.setVisibility(8);
            z2 = false;
        }
        this.s = (Button) viewGroup.findViewById(16908314);
        this.s.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i3 = this.f116d;
                drawable2.setBounds(0, 0, i3, i3);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            z2 |= true;
        } else {
            this.s.setVisibility(8);
        }
        this.w = (Button) viewGroup.findViewById(16908315);
        this.w.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable3 = this.z;
            if (drawable3 != null) {
                int i4 = this.f116d;
                drawable3.setBounds(0, 0, i4, i4);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            z2 |= true;
        } else {
            this.w.setVisibility(8);
        }
        if (a(this.a)) {
            if (z2) {
                button = this.o;
            } else if (z2) {
                button = this.s;
            } else if (z2) {
                button = this.w;
            }
            a(button);
        }
        if (!z2) {
            z3 = false;
        }
        if (!z3) {
            viewGroup.setVisibility(8);
        }
    }

    private void a(ViewGroup viewGroup, View view, int i2, int i3) {
        View findViewById = this.f115c.findViewById(c.a.f.scrollIndicatorUp);
        View findViewById2 = this.f115c.findViewById(c.a.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            b0.a(view, i2, i3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i2 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i2 & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f118f != null) {
                this.A.setOnScrollChangeListener(new b(this, findViewById, view2));
                this.A.post(new c(findViewById, view2));
                return;
            }
            ListView listView = this.f119g;
            if (listView != null) {
                listView.setOnScrollListener(new d(this, findViewById, view2));
                this.f119g.post(new e(findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    private void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private static boolean a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    private void b(ViewGroup viewGroup) {
        this.A = (NestedScrollView) this.f115c.findViewById(c.a.f.scrollView);
        this.A.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        this.F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.F;
        if (textView != null) {
            CharSequence charSequence = this.f118f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f119g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f119g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private int c() {
        int i2 = this.K;
        return i2 == 0 ? this.J : this.Q == 1 ? i2 : this.J;
    }

    private void c(ViewGroup viewGroup) {
        View view = this.f120h;
        boolean z2 = false;
        if (view == null) {
            view = this.f121i != 0 ? LayoutInflater.from(this.a).inflate(this.f121i, viewGroup, false) : null;
        }
        if (view != null) {
            z2 = true;
        }
        if (!z2 || !c(view)) {
            this.f115c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) this.f115c.findViewById(c.a.f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.f122j, this.f123k, this.f124l, this.f125m);
            }
            if (this.f119g != null) {
                ((LinearLayout.LayoutParams) ((h0.a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    static boolean c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f115c.findViewById(c.a.f.parentPanel);
        View findViewById4 = findViewById3.findViewById(c.a.f.topPanel);
        View findViewById5 = findViewById3.findViewById(c.a.f.contentPanel);
        View findViewById6 = findViewById3.findViewById(c.a.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(c.a.f.customPanel);
        c(viewGroup);
        View findViewById7 = viewGroup.findViewById(c.a.f.topPanel);
        View findViewById8 = viewGroup.findViewById(c.a.f.contentPanel);
        View findViewById9 = viewGroup.findViewById(c.a.f.buttonPanel);
        ViewGroup a2 = a(findViewById7, findViewById4);
        ViewGroup a3 = a(findViewById8, findViewById5);
        ViewGroup a4 = a(findViewById9, findViewById6);
        b(a3);
        a(a4);
        d(a2);
        int i2 = 0;
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (a2 == null || a2.getVisibility() == 8) ? false : true;
        boolean z4 = (a4 == null || a4.getVisibility() == 8) ? false : true;
        if (!(z4 || a3 == null || (findViewById2 = a3.findViewById(c.a.f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z3) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f118f == null && this.f119g == null)) {
                view = a2.findViewById(c.a.f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a3 == null || (findViewById = a3.findViewById(c.a.f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f119g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z3, z4);
        }
        if (!z2) {
            View view2 = this.f119g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z4) {
                    i2 = 2;
                }
                int i3 = z3 ? 1 : 0;
                char c2 = z3 ? 1 : 0;
                char c3 = z3 ? 1 : 0;
                a(a3, view2, i3 | i2, 3);
            }
        }
        ListView listView2 = this.f119g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.I;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }

    private void d(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f115c.findViewById(c.a.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f115c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f117e)) || !this.P) {
            this.f115c.findViewById(c.a.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.E = (TextView) this.f115c.findViewById(c.a.f.alertTitle);
        this.E.setText(this.f117e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    public int a(int i2) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView a() {
        return this.f119g;
    }

    public void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void a(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void a(View view) {
        this.G = view;
    }

    public void a(View view, int i2, int i3, int i4, int i5) {
        this.f120h = view;
        this.f121i = 0;
        this.n = true;
        this.f122j = i2;
        this.f123k = i3;
        this.f124l = i4;
        this.f125m = i5;
    }

    public void a(CharSequence charSequence) {
        this.f118f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.a(keyEvent);
    }

    public void b() {
        this.f114b.setContentView(c());
        d();
    }

    public void b(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void b(View view) {
        this.f120h = view;
        this.f121i = 0;
        this.n = false;
    }

    public void b(CharSequence charSequence) {
        this.f117e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean b(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.a(keyEvent);
    }

    public void c(int i2) {
        this.f120h = null;
        this.f121i = i2;
        this.n = false;
    }
}
