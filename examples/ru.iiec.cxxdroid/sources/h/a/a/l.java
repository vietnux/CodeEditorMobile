package h.a.a;

public class l {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8683b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8684c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8685d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8686e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8687f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8688g;

    class a extends p<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f8689c;

        a(h hVar) {
            this.f8689c = hVar;
        }

        /* access modifiers changed from: protected */
        @Override // h.a.a.p
        public String a() {
            this.f8689c.b(l.this.f8683b);
            StringBuilder sb = new StringBuilder();
            while (true) {
                short e2 = this.f8689c.e();
                if (e2 == 0) {
                    return sb.toString();
                }
                sb.append((char) e2);
            }
        }
    }

    l(h hVar, long j2) {
        long j3;
        hVar.b(j2);
        if (hVar.a.a == 1) {
            this.a = hVar.a();
            this.f8683b = (long) hVar.a();
            this.f8684c = (long) hVar.a();
            hVar.a();
            this.f8685d = (long) hVar.a();
            this.f8686e = (long) hVar.a();
            this.f8687f = hVar.a();
            j3 = (long) hVar.a();
        } else {
            this.a = hVar.a();
            this.f8687f = hVar.a();
            this.f8683b = hVar.c();
            this.f8684c = hVar.c();
            hVar.c();
            this.f8685d = hVar.c();
            this.f8686e = hVar.c();
            j3 = hVar.c();
        }
        this.f8688g = j3;
        if (this.a == 3) {
            new a(hVar);
        }
    }

    public boolean a() {
        return (this.f8687f & 1) != 0;
    }

    public boolean b() {
        return (this.f8687f & 4) != 0;
    }

    public boolean c() {
        return (this.f8687f & 2) != 0;
    }

    public String toString() {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                str = "PT_NULL";
                break;
            case 1:
                str = "PT_LOAD";
                break;
            case 2:
                str = "PT_DYNAMIC";
                break;
            case 3:
                str = "PT_INTERP";
                break;
            case 4:
                str = "PT_NOTE";
                break;
            case 5:
                str = "PT_SHLIB";
                break;
            case 6:
                str = "PT_PHDR";
                break;
            default:
                str = "0x" + Long.toHexString((long) this.a);
                break;
        }
        String str3 = "";
        if (b()) {
            str2 = str3 + str3 + "read";
        } else {
            str2 = str3;
        }
        if (c()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str2.isEmpty() ? str3 : "|");
            sb.append("write");
            str2 = sb.toString();
        }
        if (a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            if (!str2.isEmpty()) {
                str3 = "|";
            }
            sb2.append(str3);
            sb2.append("execute");
            str2 = sb2.toString();
        }
        if (str2.isEmpty()) {
            str2 = "0x" + Long.toHexString((long) this.f8687f);
        }
        return "ElfProgramHeader[p_type=" + str + ", p_filesz=" + this.f8685d + ", p_memsz=" + this.f8686e + ", p_flags=" + str2 + ", p_align=" + this.f8688g + ", range=[0x" + Long.toHexString(this.f8684c) + "-0x" + Long.toHexString(this.f8684c + this.f8686e) + "]]";
    }
}
