package k.a.a.a.f;

import java.io.File;

public abstract class a implements g {
    @Override // k.a.a.a.f.g
    public abstract boolean accept(File file);

    @Override // k.a.a.a.f.g
    public boolean accept(File file, String str) {
        return accept(new File(file, str));
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
