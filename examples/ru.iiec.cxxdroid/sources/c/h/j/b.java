package c.h.j;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import c.h.k.c;

public class b implements Spannable {

    /* renamed from: b  reason: collision with root package name */
    private final Spannable f2355b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2356c;

    /* renamed from: d  reason: collision with root package name */
    private final PrecomputedText f2357d;

    public static final class a {
        private final TextPaint a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f2358b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2359c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2360d;

        /* renamed from: c.h.j.b$a$a  reason: collision with other inner class name */
        public static class C0047a {
            private final TextPaint a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f2361b;

            /* renamed from: c  reason: collision with root package name */
            private int f2362c;

            /* renamed from: d  reason: collision with root package name */
            private int f2363d;

            public C0047a(TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f2362c = 1;
                    this.f2363d = 1;
                } else {
                    this.f2363d = 0;
                    this.f2362c = 0;
                }
                this.f2361b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0047a a(int i2) {
                this.f2362c = i2;
                return this;
            }

            public C0047a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2361b = textDirectionHeuristic;
                return this;
            }

            public a a() {
                return new a(this.a, this.f2361b, this.f2362c, this.f2363d);
            }

            public C0047a b(int i2) {
                this.f2363d = i2;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.f2358b = params.getTextDirection();
            this.f2359c = params.getBreakStrategy();
            this.f2360d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.f2358b = textDirectionHeuristic;
            this.f2359c = i2;
            this.f2360d = i3;
        }

        public int a() {
            return this.f2359c;
        }

        public boolean a(a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f2359c != aVar.a() || this.f2360d != aVar.b())) || this.a.getTextSize() != aVar.d().getTextSize() || this.a.getTextScaleX() != aVar.d().getTextScaleX() || this.a.getTextSkewX() != aVar.d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.a.getLetterSpacing() != aVar.d().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.d().getFontFeatureSettings()))) || this.a.getFlags() != aVar.d().getFlags()) {
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(aVar.d().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.a.getTextLocale().equals(aVar.d().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? aVar.d().getTypeface() == null : this.a.getTypeface().equals(aVar.d().getTypeface());
        }

        public int b() {
            return this.f2360d;
        }

        public TextDirectionHeuristic c() {
            return this.f2358b;
        }

        public TextPaint d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f2358b == aVar.c();
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return c.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f2358b, Integer.valueOf(this.f2359c), Integer.valueOf(this.f2360d));
            } else if (i2 >= 21) {
                return c.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f2358b, Integer.valueOf(this.f2359c), Integer.valueOf(this.f2360d));
            } else if (i2 >= 18) {
                return c.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f2358b, Integer.valueOf(this.f2359c), Integer.valueOf(this.f2360d));
            } else if (i2 >= 17) {
                return c.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f2358b, Integer.valueOf(this.f2359c), Integer.valueOf(this.f2360d));
            } else {
                return c.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.f2358b, Integer.valueOf(this.f2359c), Integer.valueOf(this.f2360d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
            // Method dump skipped, instructions count: 329
            */
            throw new UnsupportedOperationException("Method not decompiled: c.h.j.b.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f2356c;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f2355b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i2) {
        return this.f2355b.charAt(i2);
    }

    public int getSpanEnd(Object obj) {
        return this.f2355b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2355b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2355b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f2357d.getSpans(i2, i3, cls) : (T[]) this.f2355b.getSpans(i2, i3, cls);
    }

    public int length() {
        return this.f2355b.length();
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2355b.nextSpanTransition(i2, i3, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2357d.removeSpan(obj);
        } else {
            this.f2355b.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2357d.setSpan(obj, i2, i3, i4);
        } else {
            this.f2355b.setSpan(obj, i2, i3, i4);
        }
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.f2355b.subSequence(i2, i3);
    }

    public String toString() {
        return this.f2355b.toString();
    }
}
