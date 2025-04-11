package c.f.b.b;

import android.util.Pair;
import java.util.HashMap;

public class c implements o {
    static final HashMap<Pair<Integer, Integer>, String> a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    static final HashMap<String, String> f2217b = new HashMap<>();

    static {
        a.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        a.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        a.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        a.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        a.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        a.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        a.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        a.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        a.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        a.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        a.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        a.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        a.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        f2217b.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        f2217b.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        f2217b.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        f2217b.put("layout_constraintTop_toTopOf", "layout_marginTop");
        f2217b.put("layout_constraintStart_toStartOf", "layout_marginStart");
        f2217b.put("layout_constraintStart_toEndOf", "layout_marginStart");
        f2217b.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        f2217b.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        f2217b.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        f2217b.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        f2217b.put("layout_constraintRight_toRightOf", "layout_marginRight");
        f2217b.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public c(l lVar) {
    }
}
