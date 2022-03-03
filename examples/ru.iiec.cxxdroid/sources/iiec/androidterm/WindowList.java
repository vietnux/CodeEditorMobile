package iiec.androidterm;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import iiec.androidterm.TermService;

public class WindowList extends ListActivity {

    /* renamed from: b  reason: collision with root package name */
    private iiec.androidterm.t.a f9274b;

    /* renamed from: c  reason: collision with root package name */
    private q f9275c;

    /* renamed from: d  reason: collision with root package name */
    private TermService f9276d;

    /* renamed from: e  reason: collision with root package name */
    private ServiceConnection f9277e = new a();

    public static class CloseButton extends ImageView {
        public CloseButton(Context context) {
            super(context);
        }

        public CloseButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public CloseButton(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
        }

        public void setPressed(boolean z) {
            if (!z || !((View) getParent()).isPressed()) {
                super.setPressed(z);
            }
        }
    }

    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            WindowList.this.f9276d = ((TermService.d) iBinder).a();
            WindowList.this.a();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            WindowList.this.f9276d = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a() {
        this.f9274b = this.f9276d.a();
        q qVar = this.f9275c;
        if (qVar == null) {
            qVar = new q(this.f9274b);
            setListAdapter(qVar);
            this.f9275c = qVar;
        } else {
            qVar.a(this.f9274b);
        }
        this.f9274b.a(qVar);
        this.f9274b.b(qVar);
    }

    public void onCreate(Bundle bundle) {
        ActionBar actionBar;
        super.onCreate(bundle);
        ListView listView = getListView();
        listView.addHeaderView(getLayoutInflater().inflate(k.window_list_new_window, (ViewGroup) listView, false), null, true);
        setResult(0);
        if (iiec.androidterm.compat.a.a >= 11 && (actionBar = getActionBar()) != null) {
            actionBar.setDisplayOptions(4, 4);
        }
    }

    /* access modifiers changed from: protected */
    public void onListItemClick(ListView listView, View view, int i2, long j2) {
        Intent intent = new Intent();
        intent.putExtra("iiec.androidterm.window_id", i2 - 1);
        setResult(-1, intent);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        q qVar = this.f9275c;
        iiec.androidterm.t.a aVar = this.f9274b;
        if (aVar != null) {
            aVar.c(qVar);
            this.f9274b.d(qVar);
        }
        if (qVar != null) {
            qVar.a((iiec.androidterm.t.a) null);
        }
        unbindService(this.f9277e);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!bindService(new Intent(this, TermService.class), this.f9277e, 1)) {
            Log.w("Term", "bind to service failed!");
        }
    }
}
