package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import j.l;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public class f extends y {

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f6823b = new UriMatcher(-1);
    private final Context a;

    static {
        f6823b.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f6823b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f6823b.addURI("com.android.contacts", "contacts/#/photo", 2);
        f6823b.addURI("com.android.contacts", "contacts/#", 3);
        f6823b.addURI("com.android.contacts", "display_photo/#", 4);
    }

    f(Context context) {
        this.a = context;
    }

    private InputStream c(w wVar) {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = wVar.f6912d;
        int match = f6823b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.y
    public y.a a(w wVar, int i2) {
        InputStream c2 = c(wVar);
        if (c2 == null) {
            return null;
        }
        return new y.a(l.a(c2), t.e.DISK);
    }

    @Override // com.squareup.picasso.y
    public boolean a(w wVar) {
        Uri uri = wVar.f6912d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f6823b.match(wVar.f6912d) != -1;
    }
}
