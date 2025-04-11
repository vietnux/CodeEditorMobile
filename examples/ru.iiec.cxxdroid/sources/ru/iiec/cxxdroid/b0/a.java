package ru.iiec.cxxdroid.b0;

import e.d.a.a.n;
import e.d.a.a.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import k.a.a.a.e;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.w0.c.c;
import qwe.qweqwe.texteditor.w0.c.f;
import qwe.qweqwe.texteditor.w0.c.j;
import ru.iiec.cxxdroid.CxxActivity;
import ru.iiec.cxxdroid.u;

public class a extends f {
    private static final Set<String> s = new HashSet(Arrays.asList("import", "def", "for", "and", "or", "from", "if", "class", "return"));
    private final CxxActivity o;
    private Process p;
    private InputStream q;
    private final HashSet<String> r = new C0159a(this);

    /* renamed from: ru.iiec.cxxdroid.b0.a$a  reason: collision with other inner class name */
    class C0159a extends HashSet<String> {
        C0159a(a aVar) {
            add("alloc.h");
            add("dos.h");
            add("iostream.h");
            add("fstream.h");
            add("windows.h");
            add("stdafx.h");
        }
    }

    class b implements Comparator<c> {
        b() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            int a = a.this.a((a) cVar.a.startsWith("_"), cVar2.a.startsWith("_"));
            if (a != 0) {
                return a;
            }
            int compare = Boolean.compare(cVar.a.toUpperCase().equals(cVar.a), cVar2.a.toUpperCase().equals(cVar2.a));
            return compare != 0 ? compare : cVar.a.compareTo(cVar2.a);
        }
    }

    public a(CxxActivity cxxActivity) {
        super(cxxActivity);
        this.f9814i = s;
        this.o = cxxActivity;
        this.f9809d = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int a(boolean z, boolean z2) {
        int compare = Boolean.compare(z, z2);
        return compare == 0 ? compare : compare > 0 ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.c.f
    public ArrayList<c> a(String str, String str2, int i2, int i3, int i4) {
        boolean z;
        ArrayList<c> arrayList = new ArrayList<>();
        String a = a(str2, i4);
        long currentTimeMillis = System.currentTimeMillis();
        i0.a("AutocompleteBench", "start get new complete: " + (System.currentTimeMillis() - currentTimeMillis));
        try {
            File file = new File(u.b(this.o));
            String str3 = u.a(this.o, str, str2, this.o.b(str)) + " -fsyntax-only -Xclang -code-completion-macros -Xclang '-code-completion-at=<stdin>:" + i2 + ":" + (i3 + 1) + "' -";
            i0.a("JediAutocomp", "exec command: " + str3);
            this.p = e.e.a.a.c(this.o).a(new String[]{qwe.qweqwe.texteditor.v0.a.g(this.o), "-c", str3}, u.j(this.o), file);
            OutputStream outputStream = this.p.getOutputStream();
            e.a(ru.iiec.cxxdroid.c0.b.g(str2, this.o), outputStream);
            outputStream.close();
            i0.a("AutocompleteBench", "exec done: " + (System.currentTimeMillis() - currentTimeMillis));
            this.p.getOutputStream();
            this.q = this.p.getInputStream();
            this.p.getErrorStream();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        InputStream inputStream = this.q;
        if (inputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                HashSet hashSet = new HashSet();
                boolean z2 = true;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || readLine.equals("###iiec_end_of_output###") || readLine.equals("###iiec_splitter######iiec_end_of_output###")) {
                        this.p.waitFor();
                    } else {
                        i0.a("JediAutocomp", "resLine:" + readLine);
                        if (z2) {
                            i0.a("AutocompleteBench", "got first line:" + (System.currentTimeMillis() - currentTimeMillis));
                            z = false;
                        } else {
                            z = z2;
                        }
                        try {
                            j a2 = b.a(a, readLine);
                            if (a2 != null) {
                                if (!a2.a.startsWith("backcompat_")) {
                                    if ((!a2.a.endsWith(">") && !a2.a.endsWith("\"")) || !this.r.contains(a2.a.substring(0, a2.a.length() - 1))) {
                                        if ((a2.a.length() > 0 && ')' == a2.a.charAt(a2.a.length() - 1)) && !hashSet.add(a2.a)) {
                                            a2.f9823f = true;
                                        }
                                        arrayList.add(a2);
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        z2 = z;
                    }
                }
                this.p.waitFor();
            } catch (IOException e4) {
                e4.printStackTrace();
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
        Collections.sort(arrayList, new b());
        i0.a("AutocompleteBench", "All complete: " + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.c.f
    public void a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        super.a(str);
        i0.a("AutocompleteBench", "take time: " + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.c.f
    public boolean a(char c2) {
        return c2 == '.' || c2 == ':' || c2 == '>';
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.c.f
    public void b(qwe.qweqwe.texteditor.w0.c.e eVar) {
        if (eVar == null) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        } else {
            int i2 = eVar.f9806f;
            if (i2 != -1 && i2 == 1) {
                a(eVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.c.f
    public boolean c() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.c.f
    public Class[] g() {
        return new Class[]{n.class, q.class};
    }
}
