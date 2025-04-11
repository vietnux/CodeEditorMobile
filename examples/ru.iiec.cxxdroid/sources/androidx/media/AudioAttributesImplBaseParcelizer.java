package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.f1480b = aVar.a(audioAttributesImplBase.f1480b, 2);
        audioAttributesImplBase.f1481c = aVar.a(audioAttributesImplBase.f1481c, 3);
        audioAttributesImplBase.f1482d = aVar.a(audioAttributesImplBase.f1482d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.a(false, false);
        aVar.b(audioAttributesImplBase.a, 1);
        aVar.b(audioAttributesImplBase.f1480b, 2);
        aVar.b(audioAttributesImplBase.f1481c, 3);
        aVar.b(audioAttributesImplBase.f1482d, 4);
    }
}
