package e.b.d.z;

public class a {
    private static final int a = a();

    private static int a() {
        String[] split = System.getProperty("java.version").split("[._]");
        int parseInt = Integer.parseInt(split[0]);
        return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
    }

    public static int b() {
        return a;
    }

    public static boolean c() {
        return a >= 9;
    }
}
