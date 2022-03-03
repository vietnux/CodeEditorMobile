package i;

import i.f0.l.c;
import j.f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f9108c = new a().a();
    private final Set<b> a;

    /* renamed from: b  reason: collision with root package name */
    private final c f9109b;

    public static final class a {
        private final List<b> a = new ArrayList();

        public g a() {
            return new g(new LinkedHashSet(this.a), null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        final String a;

        /* renamed from: b  reason: collision with root package name */
        final String f9110b;

        /* renamed from: c  reason: collision with root package name */
        final String f9111c;

        /* renamed from: d  reason: collision with root package name */
        final f f9112d;

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            if (!this.a.startsWith("*.")) {
                return str.equals(this.f9110b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f9110b.length()) {
                String str2 = this.f9110b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.f9111c.equals(bVar.f9111c) && this.f9112d.equals(bVar.f9112d);
            }
        }

        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31) + this.f9111c.hashCode()) * 31) + this.f9112d.hashCode();
        }

        public String toString() {
            return this.f9111c + this.f9112d.h();
        }
    }

    g(Set<b> set, c cVar) {
        this.a = set;
        this.f9109b = cVar;
    }

    static f a(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).k();
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).h();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static f b(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).l();
    }

    /* access modifiers changed from: package-private */
    public g a(c cVar) {
        return i.f0.c.a(this.f9109b, cVar) ? this : new g(this.a, cVar);
    }

    /* access modifiers changed from: package-private */
    public List<b> a(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.a) {
            if (bVar.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    public void a(String str, List<Certificate> list) {
        List<b> a2 = a(str);
        if (!a2.isEmpty()) {
            c cVar = this.f9109b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                int size2 = a2.size();
                f fVar = null;
                f fVar2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    b bVar = a2.get(i3);
                    if (bVar.f9111c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = b(x509Certificate);
                        }
                        if (bVar.f9112d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f9111c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = a(x509Certificate);
                        }
                        if (bVar.f9112d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f9111c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i4);
                sb.append("\n    ");
                sb.append(a((Certificate) x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = a2.size();
            for (int i5 = 0; i5 < size4; i5++) {
                sb.append("\n    ");
                sb.append(a2.get(i5));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return i.f0.c.a(this.f9109b, gVar.f9109b) && this.a.equals(gVar.a);
        }
    }

    public int hashCode() {
        c cVar = this.f9109b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.a.hashCode();
    }
}
