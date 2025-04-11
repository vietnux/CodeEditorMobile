package qwe.qweqwe.texteditor.foldernav;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.johnkil.print.PrintView;
import e.f.a.a.c.a;
import java.io.File;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;

public class IconTreeItemHolder extends a.AbstractC0120a<b> {
    private PrintView arrowView;
    private TextView tvValue;

    /* access modifiers changed from: package-private */
    public interface a {
        void a(b bVar);

        void b(b bVar);

        void c(b bVar);
    }

    public static class b {
        private final a a;

        /* renamed from: b  reason: collision with root package name */
        public int f9631b;

        /* renamed from: c  reason: collision with root package name */
        public String f9632c;

        /* renamed from: d  reason: collision with root package name */
        public final String f9633d;

        /* renamed from: e  reason: collision with root package name */
        public File f9634e;

        public b(File file, a aVar, String str) {
            this.f9631b = file.isDirectory() ? q0.ic_folder : q0.ic_drive_file;
            this.f9632c = file.getName();
            this.f9634e = file;
            this.f9633d = str;
            this.a = aVar;
        }

        public void a() {
            this.a.a(this);
        }

        public void b() {
            this.a.b(this);
        }

        public void c() {
            this.a.c(this);
        }
    }

    public IconTreeItemHolder(Context context) {
        super(context);
    }

    public View createNodeView(e.f.a.a.c.a aVar, b bVar) {
        String str;
        int i2 = 0;
        View inflate = LayoutInflater.from(this.context).inflate(o0.layout_icon_node, (ViewGroup) null, false);
        this.tvValue = (TextView) inflate.findViewById(n0.node_value);
        this.tvValue.setText(bVar.f9632c);
        ((PrintView) inflate.findViewById(n0.icon)).setIconText(this.context.getResources().getString(bVar.f9631b));
        this.arrowView = (PrintView) inflate.findViewById(n0.arrow_icon);
        this.arrowView.setVisibility(bVar.f9634e.isDirectory() ? 0 : 4);
        PrintView printView = (PrintView) inflate.findViewById(n0.btn_first);
        PrintView printView2 = (PrintView) inflate.findViewById(n0.btn_second);
        if (!bVar.f9634e.isFile() || aVar.d() != 2 || (str = bVar.f9633d) == null || !str.equalsIgnoreCase(bVar.f9634e.getName())) {
            if (!bVar.f9634e.isDirectory()) {
                i2 = 4;
            }
            printView.setVisibility(i2);
            printView.setOnClickListener(new e(bVar));
            printView2.setIconText(q0.ic_remove);
            printView2.setOnClickListener(new f(bVar));
        } else {
            printView.setIconText(q0.ic_add_lib);
            printView.setOnClickListener(new g(bVar));
            printView2.setVisibility(8);
        }
        if (aVar.d() == 1) {
            inflate.findViewById(n0.btn_second).setVisibility(8);
        }
        return inflate;
    }

    @Override // e.f.a.a.c.a.AbstractC0120a
    public void toggle(boolean z) {
        this.arrowView.setIconText(this.context.getResources().getString(z ? q0.ic_keyboard_arrow_down : q0.ic_keyboard_arrow_right));
    }
}
