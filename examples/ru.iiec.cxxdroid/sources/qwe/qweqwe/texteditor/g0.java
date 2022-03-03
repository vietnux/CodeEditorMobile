package qwe.qweqwe.texteditor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

/* access modifiers changed from: package-private */
public class g0 {

    /* access modifiers changed from: package-private */
    public class a implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ TextView a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f9651b;

        a(TextView textView, int[] iArr) {
            this.a = textView;
            this.f9651b = iArr;
        }

        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            this.a.setText(this.f9651b[i2]);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    static /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
    }

    public static void a(e0 e0Var) {
        AlertDialog.Builder builder = new AlertDialog.Builder(e0Var);
        View inflate = e0Var.getLayoutInflater().inflate(o0.feedback_layout, (ViewGroup) null);
        builder.setView(inflate);
        SeekBar seekBar = (SeekBar) inflate.findViewById(n0.seekBar);
        int[] iArr = {q0.share_with_friends, q0.donate_1, q0.donate_2, q0.donate_3, q0.donate_5, q0.donate_10};
        seekBar.setMax(iArr.length - 1);
        seekBar.setOnSeekBarChangeListener(new a((TextView) inflate.findViewById(n0.price), iArr));
        seekBar.setProgress(iArr.length - 1);
        builder.setPositiveButton(q0.feedback_send, s.f9667b);
        builder.show();
    }
}
