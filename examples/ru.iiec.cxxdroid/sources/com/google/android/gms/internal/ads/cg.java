package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@k2
public final class cg extends wf {

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f4018f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g  reason: collision with root package name */
    private static final DecimalFormat f4019g = new DecimalFormat("#,###");

    /* renamed from: d  reason: collision with root package name */
    private File f4020d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4021e;

    public cg(kf kfVar) {
        super(kfVar);
        File cacheDir = this.f5937b.getCacheDir();
        if (cacheDir == null) {
            qc.d("Context.getCacheDir() returned null");
            return;
        }
        this.f4020d = new File(cacheDir, "admobVideoStreams");
        if (!this.f4020d.isDirectory() && !this.f4020d.mkdirs()) {
            String valueOf = String.valueOf(this.f4020d.getAbsolutePath());
            qc.d(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f4020d = null;
        } else if (!this.f4020d.setReadable(true, false) || !this.f4020d.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.f4020d.getAbsolutePath());
            qc.d(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f4020d = null;
        }
    }

    private final File a(File file) {
        return new File(this.f4020d, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:275:0x0401 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:199:0x04d4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:163:0x03c0 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f1, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f3, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f9, code lost:
        if (r1 < 400) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fb, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020b, code lost:
        if (r2.length() == 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020d, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0213, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0240, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0241, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0245, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0249, code lost:
        if (r7 >= 0) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024b, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0255, code lost:
        if (r1.length() == 0) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0257, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025c, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0262, code lost:
        com.google.android.gms.internal.ads.qc.d(r0);
        a(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.cg.f4018f.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0273, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0274, code lost:
        r1 = com.google.android.gms.internal.ads.cg.f4019g.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.o)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028b, code lost:
        if (r7 <= r3) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028d, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.qc.d(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c6, code lost:
        if (r1.length() == 0) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c8, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02cd, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d3, code lost:
        a(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.cg.f4018f.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e2, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.qc.b(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.x0.m();
        r17 = r16.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x033b, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r6 = new com.google.android.gms.internal.ads.ub(((java.lang.Long) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.r)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.q)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0355, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0359, code lost:
        if (r20 < 0) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x035b, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x035d, code lost:
        if (r11 <= r3) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x035f, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x036f, code lost:
        if (r1.length() == 0) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0371, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0377, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0383, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0384, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0387, code lost:
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x038a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038d, code lost:
        r1 = r10;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038f, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0399, code lost:
        if (r2.write(r1) > 0) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039b, code lost:
        r1.clear();
        r24 = ((r16.a() - r17) > (1000 * r13) ? 1 : ((r16.a() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03aa, code lost:
        if (r24 > 0) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b0, code lost:
        if (r30.f4021e != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b6, code lost:
        if (r6.a() == false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03be, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c2, code lost:
        r24 = r10;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        com.google.android.gms.internal.ads.fc.a.post(new com.google.android.gms.internal.ads.xf(r30, r31, r12.getAbsolutePath(), r11, r7, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ea, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ef, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0401, code lost:
        r6 = r19;
        r1 = r1;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0415, code lost:
        r27 = r4;
        r24 = r10;
        r15 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0424, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0425, code lost:
        r15 = "downloadTimeout";
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0458, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0459, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x045c, code lost:
        r2 = r2.toString();
        r1 = r10;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0463, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0467, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x046a, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0471, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0480, code lost:
        if (com.google.android.gms.internal.ads.qc.a(3) == false) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0482, code lost:
        r1 = com.google.android.gms.internal.ads.cg.f4019g.format((long) r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.qc.b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04b9, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04bb, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04bc, code lost:
        r15 = r22;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04be, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04c1, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ca, code lost:
        if (r0.isFile() == false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04cc, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ee, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04f6, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04fa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04fd, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0506, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0510, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x051b, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x051f, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0522, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0525, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0528, code lost:
        r2 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x052e, code lost:
        com.google.android.gms.ads.internal.x0.j().a(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0540, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r3.append("Preload aborted for URL \"");
        r3.append(r31);
        r3.append("\"");
        com.google.android.gms.internal.ads.qc.c(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0564, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r31);
        r4.append("\"");
        com.google.android.gms.internal.ads.qc.c(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05a3, code lost:
        r0 = "Could not delete partial cache file at ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05a8, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.google.android.gms.ads.internal.x0.r();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.s)).intValue();
        r3 = new java.net.URL(r31);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014f, code lost:
        if (r2 > 20) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0151, code lost:
        r5 = r3.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015d, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015f, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.jc();
        r6.a(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        if ((r7 / 100) != 3) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017e, code lost:
        if (r4 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0180, code lost:
        r6 = new java.net.URL(r3, r4);
        r3 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        if (r3 == null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0191, code lost:
        if (r3.equals("http") != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0199, code lost:
        if (r3.equals("https") != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019b, code lost:
        r2 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a7, code lost:
        if (r2.length() == 0) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a9, code lost:
        r1 = "Unsupported scheme: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ae, code lost:
        r1 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b7, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b8, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c2, code lost:
        if (r4.length() == 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c4, code lost:
        r3 = "Redirecting to ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c9, code lost:
        r3 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
        com.google.android.gms.internal.ads.qc.b(r3);
        r5.disconnect();
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01df, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e7, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01eb, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ec, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04b9 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r22 r24 r27 
      PHI: (r22v7 java.lang.String) = (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v15 java.lang.String), (r22v15 java.lang.String) binds: [B:199:0x04d4, B:200:?, B:163:0x03c0, B:166:0x03e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v3 ??) = (r24v0 ??), (r24v0 ??), (r24v4 ??), (r24v10 ??) binds: [B:199:0x04d4, B:200:?, B:163:0x03c0, B:166:0x03e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v9 java.io.FileOutputStream) = (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v13 java.io.FileOutputStream), (r27v17 java.io.FileOutputStream) binds: [B:199:0x04d4, B:200:?, B:163:0x03c0, B:166:0x03e0] A[DONT_GENERATE, DONT_INLINE], Splitter:B:166:0x03e0] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05a8  */
    @Override // com.google.android.gms.internal.ads.wf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 1474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cg.a(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void b() {
        this.f4021e = true;
    }
}
