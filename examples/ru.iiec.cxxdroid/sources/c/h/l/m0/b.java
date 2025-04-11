package c.h.l.m0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class b {

    /* access modifiers changed from: package-private */
    public class a extends InputConnectionWrapper {
        final /* synthetic */ c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z, c cVar) {
            super(inputConnection, z);
            this.a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
            if (this.a.a(c.a(inputContentInfo), i2, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i2, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.h.l.m0.b$b  reason: collision with other inner class name */
    public class C0051b extends InputConnectionWrapper {
        final /* synthetic */ c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0051b(InputConnection inputConnection, boolean z, c cVar) {
            super(inputConnection, z);
            this.a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (b.a(str, bundle, this.a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(c cVar, int i2, Bundle bundle);
    }

    @Deprecated
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        c.h.k.c.a((Object) inputConnection, "inputConnection must be non-null");
        c.h.k.c.a((Object) editorInfo, "editorInfo must be non-null");
        c.h.k.c.a((Object) cVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : a.a(editorInfo).length == 0 ? inputConnection : new C0051b(inputConnection, false, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(java.lang.String r7, android.os.Bundle r8, c.h.l.m0.b.c r9) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.l.m0.b.a(java.lang.String, android.os.Bundle, c.h.l.m0.b$c):boolean");
    }
}
