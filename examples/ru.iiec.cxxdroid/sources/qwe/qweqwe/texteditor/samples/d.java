package qwe.qweqwe.texteditor.samples;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.c.e;
import d.c.f;
import java.util.ArrayList;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;

public class d extends Fragment {
    private b Z;
    public boolean a0 = false;
    private ArrayList<e> b0;
    private View c0;

    class a extends AsyncTask {
        private final View a;

        a(View view) {
            this.a = view;
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            try {
                return d.a.a(d.this.f(), d.this.f().getIntent().getExtras().getString("key_samples_url"));
            } catch (Throwable th) {
                return th;
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            if (obj instanceof Throwable) {
                if (d.this.m() != null) {
                    Toast.makeText(d.this.m(), ((Throwable) obj).toString(), 0).show();
                }
            } else if (obj instanceof ArrayList) {
                try {
                    this.a.findViewById(n0.list).setVisibility(0);
                    this.a.findViewById(n0.p_bar).setVisibility(8);
                    d.this.b0 = (ArrayList) obj;
                    if (Build.VERSION.SDK_INT < 24) {
                        int i2 = 0;
                        while (i2 < d.this.b0.size()) {
                            if ("OpenCV".equals(((e) d.this.b0.get(i2)).a)) {
                                d.this.b0.remove(i2);
                                i2--;
                            }
                            if ("PyTorch".equals(((e) d.this.b0.get(i2)).a)) {
                                int i3 = 0;
                                while (i3 < ((e) d.this.b0.get(i2)).f6958d.size()) {
                                    if (((e) d.this.b0.get(i2)).f6958d.get(i3).f6965g.contains("opencv-python")) {
                                        ((e) d.this.b0.get(i2)).f6958d.remove(i3);
                                        i3--;
                                    }
                                    i3++;
                                }
                            }
                            i2++;
                        }
                    }
                    d.this.w0();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            try {
                this.a.findViewById(n0.list).setVisibility(8);
                this.a.findViewById(n0.p_bar).setVisibility(0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public interface b {
        void a(f fVar);
    }

    public static d c(int i2) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putInt("column-count", i2);
        dVar.m(bundle);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void w0() {
        a(L(), (ArrayList<? extends d.c.d>) this.b0, false);
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c0 = layoutInflater.inflate(o0.fragment_sample_list, viewGroup, false);
        new a(this.c0).execute(new Object[0]);
        return this.c0;
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Context context) {
        super.a(context);
        if (context instanceof b) {
            this.Z = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener");
    }

    /* access modifiers changed from: protected */
    public void a(View view, ArrayList<? extends d.c.d> arrayList, boolean z) {
        this.a0 = z;
        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(n0.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new c(f(), this, arrayList, this.Z));
    }

    @Override // androidx.fragment.app.Fragment
    public void b0() {
        super.b0();
        this.Z = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        if (k() != null) {
            k().getInt("column-count");
        }
    }

    public boolean v0() {
        try {
            if (!this.a0) {
                return false;
            }
            w0();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
