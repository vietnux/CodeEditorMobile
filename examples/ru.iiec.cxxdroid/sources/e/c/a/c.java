package e.c.a;

import android.content.Context;
import android.util.Log;
import g.k;
import g.o.w;
import g.r.c.l;
import g.r.d.g;
import g.r.d.i;
import g.r.d.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class c {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final List<e.c.a.o.a> f8069b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e.c.a.o.a> f8070c;

    /* renamed from: d  reason: collision with root package name */
    private final List<e.c.a.o.b> f8071d;

    public enum a {
        LIGHT,
        DARK,
        LIGHT_DARK_TOOLBAR
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* renamed from: e.c.a.c$c  reason: collision with other inner class name */
    public enum EnumC0116c {
        AUTHOR_NAME,
        AUTHOR_WEBSITE,
        LIBRARY_NAME,
        LIBRARY_DESCRIPTION,
        LIBRARY_VERSION,
        LIBRARY_ARTIFACT_ID,
        LIBRARY_WEBSITE,
        LIBRARY_OPEN_SOURCE,
        LIBRARY_REPOSITORY_LINK,
        LIBRARY_CLASSPATH,
        LICENSE_NAME,
        LICENSE_SHORT_DESCRIPTION,
        LICENSE_DESCRIPTION,
        LICENSE_WEBSITE
    }

    public enum d {
        SPECIAL1,
        SPECIAL2,
        SPECIAL3
    }

    /* access modifiers changed from: package-private */
    public static final class e extends j implements l<String, String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f8092c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f8093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, String str) {
            super(1);
            this.f8092c = context;
            this.f8093d = str;
        }

        public final String a(String str) {
            i.d(str, "it");
            Context context = this.f8092c;
            return e.c.a.p.b.b(context, str + this.f8093d);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends j implements l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f8094c = new f();

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // g.r.c.l
        public /* bridge */ /* synthetic */ Boolean a(String str) {
            return Boolean.valueOf(a(str));
        }

        public final boolean a(String str) {
            i.d(str, "it");
            return !g.v.e.a(str);
        }
    }

    static {
        new b(null);
    }

    public c(Context context, String[] strArr, Map<String, String> map) {
        e.c.a.o.a b2;
        i.d(context, "context");
        i.d(strArr, "fields");
        i.d(map, "libraryEnchantments");
        this.f8069b = new ArrayList();
        this.f8070c = new ArrayList();
        this.f8071d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (String str : strArr) {
            if (g.v.e.a(str, "define_license_", false, 2, (Object) null)) {
                arrayList.add(g.v.e.a(str, "define_license_", "", false, 4, (Object) null));
            } else if (g.v.e.a(str, "define_int_", false, 2, (Object) null)) {
                arrayList2.add(g.v.e.a(str, "define_int_", "", false, 4, (Object) null));
            } else if (g.v.e.a(str, "define_plu_", false, 2, (Object) null)) {
                arrayList4.add(g.v.e.a(str, "define_plu_", "", false, 4, (Object) null));
            } else if (g.v.e.a(str, "define_", false, 2, (Object) null)) {
                arrayList3.add(g.v.e.a(str, "define_", "", false, 4, (Object) null));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            i.a((Object) str2, "licenseIdentifier");
            e.c.a.o.b c2 = c(context, str2);
            if (c2 != null) {
                this.f8071d.add(c2);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            i.a((Object) str3, "pluginLibraryIdentifier");
            e.c.a.o.a b3 = b(context, str3);
            if (b3 != null) {
                b3.a(false);
                b3.c(true);
                this.f8070c.add(b3);
                this.a = true;
                String str4 = map.get(str3);
                if (!(str4 == null || (b2 = b(context, str4)) == null)) {
                    b3.b(b2);
                }
            }
        }
        if (arrayList4.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str5 = (String) it3.next();
                i.a((Object) str5, "internalIdentifier");
                e.c.a.o.a b4 = b(context, str5);
                if (b4 != null) {
                    b4.a(true);
                    this.f8069b.add(b4);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                String str6 = (String) it4.next();
                i.a((Object) str6, "externalIdentifier");
                e.c.a.o.a b5 = b(context, str6);
                if (b5 != null) {
                    b5.a(false);
                    this.f8070c.add(b5);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, String[] strArr, Map map, int i2, g gVar) {
        this(context, (i2 & 2) != 0 ? e.c.a.p.c.a(context) : strArr, (i2 & 4) != 0 ? w.a() : map);
    }

    private final List<e.c.a.o.a> a(List<e.c.a.o.a> list, String str, boolean z, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (e.c.a.o.a aVar : list) {
            if (z) {
                if (g.v.e.a((CharSequence) aVar.j(), (CharSequence) str, true)) {
                    arrayList.add(aVar);
                    i3++;
                    if (i2 != -1 && i2 < i3) {
                        break;
                    }
                } else {
                    continue;
                }
            } else if (g.v.e.a((CharSequence) aVar.l(), (CharSequence) str, true) || g.v.e.a((CharSequence) aVar.j(), (CharSequence) str, true)) {
                arrayList.add(aVar);
                i3++;
                if (i2 != -1 && i2 < i3) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private final e.c.a.o.a b(Context context, String str) {
        String a2 = g.v.e.a(str, "-", "_", false, 4, (Object) null);
        try {
            e.c.a.o.a aVar = new e.c.a.o.a(a2, false, false, e.c.a.p.b.b(context, "library_" + a2 + "_libraryName"), null, null, null, null, null, null, null, false, null, null, 16374, null);
            HashMap<String, String> a3 = a(context, a2);
            aVar.a(e.c.a.p.b.b(context, "library_" + a2 + "_author"));
            aVar.b(e.c.a.p.b.b(context, "library_" + a2 + "_authorWebsite"));
            aVar.e(a(e.c.a.p.b.b(context, "library_" + a2 + "_libraryDescription"), a3));
            aVar.g(e.c.a.p.b.b(context, "library_" + a2 + "_libraryVersion"));
            aVar.d(e.c.a.p.b.b(context, "library_" + a2 + "_libraryArtifactId"));
            aVar.h(e.c.a.p.b.b(context, "library_" + a2 + "_libraryWebsite"));
            String b2 = e.c.a.p.b.b(context, "library_" + a2 + "_licenseId");
            if (g.v.e.a(b2)) {
                String b3 = e.c.a.p.b.b(context, "library_" + a2 + "_licenseVersion");
                String b4 = e.c.a.p.b.b(context, "library_" + a2 + "_licenseLink");
                String a4 = a(e.c.a.p.b.b(context, "library_" + a2 + "_licenseContent"), a3);
                aVar.a(new e.c.a.o.b("", b3, b4, a4, a(e.c.a.p.b.b(context, "library_" + a2 + "_licenseContent"), a3)));
            } else {
                e.c.a.o.b b5 = b(b2);
                if (b5 != null) {
                    e.c.a.o.b a5 = e.c.a.o.b.a(b5, null, null, null, null, null, 31, null);
                    a5.c(a(a5.d(), a3));
                    a5.a(a(a5.b(), a3));
                    aVar.a(a5);
                }
            }
            Boolean valueOf = Boolean.valueOf(e.c.a.p.b.b(context, "library_" + a2 + "_isOpenSource"));
            i.a((Object) valueOf, "java.lang.Boolean.valueO… name + \"_isOpenSource\"))");
            aVar.b(valueOf.booleanValue());
            aVar.i(e.c.a.p.b.b(context, "library_" + a2 + "_repositoryLink"));
            aVar.c(e.c.a.p.b.b(context, "library_" + a2 + "_classPath"));
            if (!g.v.e.a(aVar.l()) || !g.v.e.a(aVar.k())) {
                return aVar;
            }
            return null;
        } catch (Exception e2) {
            Log.e("aboutlibraries", "Failed to generateLibrary from file: " + e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        g.q.a.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final e.c.a.o.b c(android.content.Context r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.c.c(android.content.Context, java.lang.String):e.c.a.o.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.c.a.o.a a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "libraryName"
            g.r.d.i.d(r5, r0)
            java.util.List r0 = r4.c()
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            e.c.a.o.a r1 = (e.c.a.o.a) r1
            java.lang.String r2 = r1.l()
            r3 = 1
            boolean r2 = g.v.e.b(r2, r5, r3)
            if (r2 == 0) goto L_0x0025
            return r1
        L_0x0025:
            java.lang.String r2 = r1.j()
            boolean r2 = g.v.e.b(r2, r5, r3)
            if (r2 == 0) goto L_0x000d
            return r1
        L_0x0030:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.c.a(java.lang.String):e.c.a.o.a");
    }

    public final String a(String str, HashMap<String, String> hashMap) {
        boolean z;
        i.d(str, "insertIntoVar");
        i.d(hashMap, "variables");
        while (true) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("<<<");
                    Locale locale = Locale.US;
                    i.a((Object) locale, "Locale.US");
                    if (key != null) {
                        String upperCase = key.toUpperCase(locale);
                        i.a((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
                        sb.append(upperCase);
                        sb.append(">>>");
                        str = g.v.e.a(str, sb.toString(), value, false, 4, (Object) null);
                    } else {
                        throw new k("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            return g.v.e.a(g.v.e.a(str, "<<<", "", false, 4, (Object) null), ">>>", "", false, 4, (Object) null);
        }
    }

    public final ArrayList<e.c.a.o.a> a() {
        return new ArrayList<>(this.f8070c);
    }

    public final ArrayList<e.c.a.o.a> a(Context context, String[] strArr, String[] strArr2, boolean z, boolean z2, boolean z3) {
        i.d(context, "ctx");
        i.d(strArr, "internalLibraries");
        i.d(strArr2, "excludeLibraries");
        boolean z4 = !(strArr2.length == 0);
        HashMap hashMap = new HashMap();
        ArrayList<e.c.a.o.a> arrayList = new ArrayList<>();
        if (!this.a && z) {
            List<e.c.a.o.a> a2 = a(context, z2);
            arrayList.addAll(a2);
            if (z4) {
                for (e.c.a.o.a aVar : a2) {
                    hashMap.put(aVar.j(), aVar);
                }
            }
        }
        ArrayList<e.c.a.o.a> a3 = a();
        arrayList.addAll(a3);
        if (z4) {
            Iterator<e.c.a.o.a> it = a3.iterator();
            while (it.hasNext()) {
                e.c.a.o.a next = it.next();
                String j2 = next.j();
                i.a((Object) next, "lib");
                hashMap.put(j2, next);
            }
        }
        if (!(strArr.length == 0)) {
            for (String str : strArr) {
                e.c.a.o.a a4 = a(str);
                if (a4 != null) {
                    arrayList.add(a4);
                    hashMap.put(a4.j(), a4);
                }
            }
        }
        if (z4) {
            for (String str2 : strArr2) {
                e.c.a.o.a aVar2 = (e.c.a.o.a) hashMap.get(str2);
                if (aVar2 != null) {
                    i.a((Object) aVar2, "libraries[excludeLibrary] ?: continue");
                    arrayList.remove(aVar2);
                }
            }
        }
        if (z3) {
            g.o.g.b((List) arrayList);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.String> a(android.content.Context r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.c.a(android.content.Context, java.lang.String):java.util.HashMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<e.c.a.o.a> a(android.content.Context r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.c.a(android.content.Context, boolean):java.util.List");
    }

    public final List<e.c.a.o.a> a(String str, boolean z, int i2) {
        i.d(str, "searchTerm");
        return a(a(), str, z, i2);
    }

    public final void a(HashMap<String, HashMap<String, String>> hashMap) {
        if (hashMap != null) {
            for (Map.Entry<String, HashMap<String, String>> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                HashMap<String, String> value = entry.getValue();
                List<e.c.a.o.a> a2 = a(key, true, 1);
                if (a2 == null || a2.isEmpty()) {
                    a2 = b(key, true, 1);
                }
                if (a2.size() == 1) {
                    e.c.a.o.a aVar = a2.get(0);
                    for (Map.Entry<String, String> entry2 : value.entrySet()) {
                        String key2 = entry2.getKey();
                        String value2 = entry2.getValue();
                        Locale locale = Locale.US;
                        i.a((Object) locale, "Locale.US");
                        if (key2 != null) {
                            String upperCase = key2.toUpperCase(locale);
                            i.a((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
                            if (i.a((Object) upperCase, (Object) EnumC0116c.AUTHOR_NAME.name())) {
                                aVar.a(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.AUTHOR_WEBSITE.name())) {
                                aVar.b(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_NAME.name())) {
                                aVar.f(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_DESCRIPTION.name())) {
                                aVar.e(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_VERSION.name())) {
                                aVar.g(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_ARTIFACT_ID.name())) {
                                aVar.d(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_WEBSITE.name())) {
                                aVar.h(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_OPEN_SOURCE.name())) {
                                aVar.b(Boolean.parseBoolean(value2));
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_REPOSITORY_LINK.name())) {
                                aVar.i(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LIBRARY_CLASSPATH.name())) {
                                aVar.c(value2);
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LICENSE_NAME.name())) {
                                if (aVar.o() == null) {
                                    aVar.a(new e.c.a.o.b("", "", "", "", ""));
                                }
                                e.c.a.o.b o = aVar.o();
                                if (o != null) {
                                    o.b(value2);
                                }
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LICENSE_SHORT_DESCRIPTION.name())) {
                                if (aVar.o() == null) {
                                    aVar.a(new e.c.a.o.b("", "", "", "", ""));
                                }
                                e.c.a.o.b o2 = aVar.o();
                                if (o2 != null) {
                                    o2.c(value2);
                                }
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LICENSE_DESCRIPTION.name())) {
                                if (aVar.o() == null) {
                                    aVar.a(new e.c.a.o.b("", "", "", "", ""));
                                }
                                e.c.a.o.b o3 = aVar.o();
                                if (o3 != null) {
                                    o3.a(value2);
                                }
                            } else if (i.a((Object) upperCase, (Object) EnumC0116c.LICENSE_WEBSITE.name())) {
                                if (aVar.o() == null) {
                                    aVar.a(new e.c.a.o.b("", "", "", "", ""));
                                }
                                e.c.a.o.b o4 = aVar.o();
                                if (o4 != null) {
                                    o4.d(value2);
                                }
                            }
                        } else {
                            throw new k("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    continue;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.c.a.o.b b(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "licenseName"
            g.r.d.i.d(r5, r0)
            java.util.ArrayList r0 = r4.d()
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            e.c.a.o.b r1 = (e.c.a.o.b) r1
            java.lang.String r2 = r1.c()
            r3 = 1
            boolean r2 = g.v.e.b(r2, r5, r3)
            if (r2 == 0) goto L_0x0025
            return r1
        L_0x0025:
            java.lang.String r2 = r1.a()
            boolean r2 = g.v.e.b(r2, r5, r3)
            if (r2 == 0) goto L_0x000d
            return r1
        L_0x0030:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.c.b(java.lang.String):e.c.a.o.b");
    }

    public final ArrayList<e.c.a.o.a> b() {
        return new ArrayList<>(this.f8069b);
    }

    public final List<e.c.a.o.a> b(String str, boolean z, int i2) {
        i.d(str, "searchTerm");
        return a(b(), str, z, i2);
    }

    public final List<e.c.a.o.a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b());
        arrayList.addAll(a());
        return arrayList;
    }

    public final ArrayList<e.c.a.o.b> d() {
        return new ArrayList<>(this.f8071d);
    }
}
