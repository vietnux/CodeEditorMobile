package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import c.h.l.b0;
import c.h.l.e;
import c.h.l.m0.b;
import c.h.l.m0.c;

final class s {

    /* access modifiers changed from: package-private */
    public class a implements b.c {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // c.h.l.m0.b.c
        public boolean a(c cVar, int i2, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
                try {
                    cVar.d();
                    InputContentInfo inputContentInfo = (InputContentInfo) cVar.e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e2) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                    return false;
                }
            }
            e.a aVar = new e.a(new ClipData(cVar.b(), new ClipData.Item(cVar.a())), 2);
            aVar.a(cVar.c());
            aVar.a(bundle);
            return b0.a(this.a, aVar.a()) == null;
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        static boolean a(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            b0.a(view, new e.a(dragEvent.getClipData(), 3).a());
            return true;
        }

        /* JADX INFO: finally extract failed */
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                b0.a(textView, new e.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }
    }

    static b.c a(View view) {
        return new a(view);
    }

    static boolean a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && b0.u(view) != null) {
            Activity b2 = b(view);
            if (b2 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? b.a(dragEvent, (TextView) view, b2) : b.a(dragEvent, view, b2);
                }
            }
        }
        return false;
    }

    static boolean a(TextView textView, int i2) {
        int i3 = 0;
        if ((i2 != 16908322 && i2 != 16908337) || b0.u(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            e.a aVar = new e.a(primaryClip, 1);
            if (i2 != 16908322) {
                i3 = 1;
            }
            aVar.a(i3);
            b0.a(textView, aVar.a());
        }
        return true;
    }

    static Activity b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
