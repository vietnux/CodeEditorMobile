package e.d.a.a;

public class o0 extends Exception {
    public static void a(String str) {
        a(false, str);
    }

    public static void a(boolean z, String str) {
        if (!z) {
            System.err.print("TextWarrior assertion failed: ");
            System.err.println(str);
        }
    }
}
