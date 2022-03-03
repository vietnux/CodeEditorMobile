package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) aVar.a(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.f1479b = aVar.a(audioAttributesImplApi21.f1479b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.a(false, false);
        aVar.b(audioAttributesImplApi21.a, 1);
        aVar.b(audioAttributesImplApi21.f1479b, 2);
    }
}
