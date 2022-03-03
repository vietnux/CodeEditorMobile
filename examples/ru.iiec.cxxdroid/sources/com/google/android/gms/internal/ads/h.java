package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final class h implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4460b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4461c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ g f4462d;

    h(g gVar, String str, String str2) {
        this.f4462d = gVar;
        this.f4460b = str;
        this.f4461c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        DownloadManager downloadManager = (DownloadManager) this.f4462d.f4360d.getSystemService("download");
        try {
            String str = this.f4460b;
            String str2 = this.f4461c;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            x0.h().a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f4462d.a("Could not store picture.");
        }
    }
}
