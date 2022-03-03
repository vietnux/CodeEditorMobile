package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.ads.o.a;
import java.util.Map;

@k2
public final class tk0 extends n {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f5636c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f5637d;

    /* renamed from: e  reason: collision with root package name */
    private String f5638e = d("description");

    /* renamed from: f  reason: collision with root package name */
    private long f5639f = e("start_ticks");

    /* renamed from: g  reason: collision with root package name */
    private long f5640g = e("end_ticks");

    /* renamed from: h  reason: collision with root package name */
    private String f5641h = d("summary");

    /* renamed from: i  reason: collision with root package name */
    private String f5642i = d("location");

    public tk0(lg lgVar, Map<String, String> map) {
        super(lgVar, "createCalendarEvent");
        this.f5636c = map;
        this.f5637d = lgVar.b0();
    }

    private final String d(String str) {
        return TextUtils.isEmpty(this.f5636c.get(str)) ? "" : this.f5636c.get(str);
    }

    private final long e(String str) {
        String str2 = this.f5636c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent a() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f5638e);
        data.putExtra("eventLocation", this.f5642i);
        data.putExtra("description", this.f5641h);
        long j2 = this.f5639f;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = this.f5640g;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void b() {
        if (this.f5637d == null) {
            a("Activity context is not available.");
            return;
        }
        x0.f();
        if (!u9.f(this.f5637d).d()) {
            a("This feature is not available on the device.");
            return;
        }
        x0.f();
        AlertDialog.Builder e2 = u9.e(this.f5637d);
        Resources b2 = x0.j().b();
        e2.setTitle(b2 != null ? b2.getString(a.s5) : "Create calendar event");
        e2.setMessage(b2 != null ? b2.getString(a.s6) : "Allow Ad to create a calendar event?");
        e2.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new uk0(this));
        e2.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new c(this));
        e2.create().show();
    }
}
