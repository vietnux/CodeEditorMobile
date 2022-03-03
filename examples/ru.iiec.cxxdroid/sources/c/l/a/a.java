package c.l.a;

import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class a {
    private static final c A = new c("StripOffsets", 273, 3);
    private static final c[] B = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
    private static final c[] C = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
    private static final c[] D = {new c("AspectFrame", 4371, 3)};
    private static final c[] E = {new c("ColorSpace", 55, 3)};
    static final c[][] F;
    private static final c[] G = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
    private static final HashMap<Integer, c>[] H;
    private static final HashMap<String, c>[] I;
    private static final HashSet<String> J = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    private static final HashMap<Integer, Integer> K = new HashMap<>();
    static final Charset L = Charset.forName("US-ASCII");
    static final byte[] M = "Exif\u0000\u0000".getBytes(L);

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f2488m = {8, 8, 8};
    public static final int[] n = {8};
    static final byte[] o = {-1, -40, -1};
    private static final byte[] p = {79, 76, 89, 77, 80, 0};
    private static final byte[] q = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static SimpleDateFormat r = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    static final String[] s = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    static final int[] t = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] u = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final c[] v = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", ModuleDescriptor.MODULE_VERSION, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
    private static final c[] w = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private static final c[] x = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
    private static final c[] y = {new c("InteroperabilityIndex", 1, 2)};
    private static final c[] z = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", ModuleDescriptor.MODULE_VERSION, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager.AssetInputStream f2489b;

    /* renamed from: c  reason: collision with root package name */
    private int f2490c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, b>[] f2491d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f2492e;

    /* renamed from: f  reason: collision with root package name */
    private ByteOrder f2493f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    private int f2494g;

    /* renamed from: h  reason: collision with root package name */
    private int f2495h;

    /* renamed from: i  reason: collision with root package name */
    private int f2496i;

    /* renamed from: j  reason: collision with root package name */
    private int f2497j;

    /* renamed from: k  reason: collision with root package name */
    private int f2498k;

    /* renamed from: l  reason: collision with root package name */
    private int f2499l;

    /* access modifiers changed from: private */
    /* renamed from: c.l.a.a$a  reason: collision with other inner class name */
    public static class C0056a extends InputStream implements DataInput {

        /* renamed from: f  reason: collision with root package name */
        private static final ByteOrder f2500f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g  reason: collision with root package name */
        private static final ByteOrder f2501g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b  reason: collision with root package name */
        private DataInputStream f2502b;

        /* renamed from: c  reason: collision with root package name */
        private ByteOrder f2503c;

        /* renamed from: d  reason: collision with root package name */
        final int f2504d;

        /* renamed from: e  reason: collision with root package name */
        int f2505e;

        public C0056a(InputStream inputStream) {
            this.f2503c = ByteOrder.BIG_ENDIAN;
            this.f2502b = new DataInputStream(inputStream);
            this.f2504d = this.f2502b.available();
            this.f2505e = 0;
            this.f2502b.mark(this.f2504d);
        }

        public C0056a(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        public void a(ByteOrder byteOrder) {
            this.f2503c = byteOrder;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f2502b.available();
        }

        public void g(long j2) {
            int i2 = this.f2505e;
            if (((long) i2) > j2) {
                this.f2505e = 0;
                this.f2502b.reset();
                this.f2502b.mark(this.f2504d);
            } else {
                j2 -= (long) i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int l() {
            return this.f2505e;
        }

        public long m() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f2505e++;
            return this.f2502b.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            int read = this.f2502b.read(bArr, i2, i3);
            this.f2505e += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f2505e++;
            return this.f2502b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f2505e++;
            if (this.f2505e <= this.f2504d) {
                int read = this.f2502b.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f2505e += 2;
            return this.f2502b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f2505e += bArr.length;
            if (this.f2505e > this.f2504d) {
                throw new EOFException();
            } else if (this.f2502b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) {
            this.f2505e += i3;
            if (this.f2505e > this.f2504d) {
                throw new EOFException();
            } else if (this.f2502b.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f2505e += 4;
            if (this.f2505e <= this.f2504d) {
                int read = this.f2502b.read();
                int read2 = this.f2502b.read();
                int read3 = this.f2502b.read();
                int read4 = this.f2502b.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f2503c;
                    if (byteOrder == f2500f) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f2501g) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f2503c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f2505e += 8;
            if (this.f2505e <= this.f2504d) {
                int read = this.f2502b.read();
                int read2 = this.f2502b.read();
                int read3 = this.f2502b.read();
                int read4 = this.f2502b.read();
                int read5 = this.f2502b.read();
                int read6 = this.f2502b.read();
                int read7 = this.f2502b.read();
                int read8 = this.f2502b.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f2503c;
                    if (byteOrder == f2500f) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f2501g) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f2503c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f2505e += 2;
            if (this.f2505e <= this.f2504d) {
                int read = this.f2502b.read();
                int read2 = this.f2502b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f2503c;
                    if (byteOrder == f2500f) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f2501g) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f2503c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f2505e += 2;
            return this.f2502b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f2505e++;
            return this.f2502b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f2505e += 2;
            if (this.f2505e <= this.f2504d) {
                int read = this.f2502b.read();
                int read2 = this.f2502b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f2503c;
                    if (byteOrder == f2500f) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f2501g) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f2503c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) {
            int min = Math.min(i2, this.f2504d - this.f2505e);
            int i3 = 0;
            while (i3 < min) {
                i3 += this.f2502b.skipBytes(min - i3);
            }
            this.f2505e += i3;
            return i3;
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2506b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f2507c;

        b(int i2, int i3, byte[] bArr) {
            this.a = i2;
            this.f2506b = i3;
            this.f2507c = bArr;
        }

        public static b a(int i2, ByteOrder byteOrder) {
            return a(new int[]{i2}, byteOrder);
        }

        public static b a(long j2, ByteOrder byteOrder) {
            return a(new long[]{j2}, byteOrder);
        }

        public static b a(d dVar, ByteOrder byteOrder) {
            return a(new d[]{dVar}, byteOrder);
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.L);
            return new b(2, bytes.length, bytes);
        }

        public static b a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.t[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i2 : iArr) {
                wrap.putShort((short) i2);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public static b a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.t[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j2 : jArr) {
                wrap.putInt((int) j2);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b a(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.t[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.a);
                wrap.putInt((int) dVar.f2511b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public double a(ByteOrder byteOrder) {
            Object d2 = d(byteOrder);
            if (d2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (d2 instanceof String) {
                return Double.parseDouble((String) d2);
            } else {
                if (d2 instanceof long[]) {
                    long[] jArr = (long[]) d2;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d2 instanceof int[]) {
                    int[] iArr = (int[]) d2;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d2 instanceof double[]) {
                    double[] dArr = (double[]) d2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d2 instanceof d[]) {
                    d[] dVarArr = (d[]) d2;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int b(ByteOrder byteOrder) {
            Object d2 = d(byteOrder);
            if (d2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (d2 instanceof String) {
                return Integer.parseInt((String) d2);
            } else {
                if (d2 instanceof long[]) {
                    long[] jArr = (long[]) d2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d2 instanceof int[]) {
                    int[] iArr = (int[]) d2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String c(ByteOrder byteOrder) {
            Object d2 = d(byteOrder);
            if (d2 == null) {
                return null;
            }
            if (d2 instanceof String) {
                return (String) d2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (d2 instanceof long[]) {
                long[] jArr = (long[]) d2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (d2 instanceof int[]) {
                int[] iArr = (int[]) d2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (d2 instanceof double[]) {
                double[] dArr = (double[]) d2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(d2 instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) d2;
                while (i2 < dVarArr.length) {
                    sb.append(dVarArr[i2].a);
                    sb.append('/');
                    sb.append(dVarArr[i2].f2511b);
                    i2++;
                    if (i2 != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x019f A[SYNTHETIC, Splitter:B:139:0x019f] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01ab A[SYNTHETIC, Splitter:B:146:0x01ab] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(java.nio.ByteOrder r11) {
            /*
            // Method dump skipped, instructions count: 464
            */
            throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.b.d(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.s[this.a] + ", data length:" + this.f2507c.length + ")";
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2508b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2509c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2510d;

        c(String str, int i2, int i3) {
            this.f2508b = str;
            this.a = i2;
            this.f2509c = i3;
            this.f2510d = -1;
        }

        c(String str, int i2, int i3, int i4) {
            this.f2508b = str;
            this.a = i2;
            this.f2509c = i3;
            this.f2510d = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2) {
            int i3;
            int i4 = this.f2509c;
            if (i4 == 7 || i2 == 7 || i4 == i2 || (i3 = this.f2510d) == i2) {
                return true;
            }
            if ((i4 == 4 || i3 == 4) && i2 == 3) {
                return true;
            }
            if ((this.f2509c == 9 || this.f2510d == 9) && i2 == 8) {
                return true;
            }
            return (this.f2509c == 12 || this.f2510d == 12) && i2 == 11;
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        public final long a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2511b;

        d(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0;
                this.f2511b = 1;
                return;
            }
            this.a = j2;
            this.f2511b = j3;
        }

        public double a() {
            return ((double) this.a) / ((double) this.f2511b);
        }

        public String toString() {
            return this.a + "/" + this.f2511b;
        }
    }

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        new int[1][0] = 4;
        c[] cVarArr = v;
        F = new c[][]{cVarArr, w, x, y, z, cVarArr, B, C, D, E};
        new c("JPEGInterchangeFormat", 513, 4);
        new c("JPEGInterchangeFormatLength", 514, 4);
        c[][] cVarArr2 = F;
        H = new HashMap[cVarArr2.length];
        I = new HashMap[cVarArr2.length];
        r.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i2 = 0; i2 < F.length; i2++) {
            H[i2] = new HashMap<>();
            I[i2] = new HashMap<>();
            c[] cVarArr3 = F[i2];
            for (c cVar : cVarArr3) {
                H[i2].put(Integer.valueOf(cVar.a), cVar);
                I[i2].put(cVar.f2508b, cVar);
            }
        }
        K.put(Integer.valueOf(G[0].a), 5);
        K.put(Integer.valueOf(G[1].a), 1);
        K.put(Integer.valueOf(G[2].a), 2);
        K.put(Integer.valueOf(G[3].a), 3);
        K.put(Integer.valueOf(G[4].a), 7);
        K.put(Integer.valueOf(G[5].a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public a(String str) {
        Throwable th;
        c[][] cVarArr = F;
        this.f2491d = new HashMap[cVarArr.length];
        this.f2492e = new HashSet(cVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f2489b = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    a((InputStream) fileInputStream2);
                    a((Closeable) fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                a((Closeable) fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    private int a(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (a(bArr)) {
            return 4;
        }
        if (c(bArr)) {
            return 9;
        }
        if (b(bArr)) {
            return 7;
        }
        return d(bArr) ? 10 : 0;
    }

    private void a() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a("DateTime") == null) {
            this.f2491d[0].put("DateTime", b.a(a2));
        }
        if (a("ImageWidth") == null) {
            this.f2491d[0].put("ImageWidth", b.a(0L, this.f2493f));
        }
        if (a("ImageLength") == null) {
            this.f2491d[0].put("ImageLength", b.a(0L, this.f2493f));
        }
        if (a("Orientation") == null) {
            this.f2491d[0].put("Orientation", b.a(0L, this.f2493f));
        }
        if (a("LightSource") == null) {
            this.f2491d[1].put("LightSource", b.a(0L, this.f2493f));
        }
    }

    private void a(int i2, int i3) {
        if (!this.f2491d[i2].isEmpty() && !this.f2491d[i3].isEmpty()) {
            b bVar = this.f2491d[i2].get("ImageLength");
            b bVar2 = this.f2491d[i2].get("ImageWidth");
            b bVar3 = this.f2491d[i3].get("ImageLength");
            b bVar4 = this.f2491d[i3].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int b2 = bVar.b(this.f2493f);
                int b3 = bVar2.b(this.f2493f);
                int b4 = bVar3.b(this.f2493f);
                int b5 = bVar4.b(this.f2493f);
                if (b2 < b4 && b3 < b5) {
                    HashMap<String, b>[] hashMapArr = this.f2491d;
                    HashMap<String, b> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(c.l.a.a.C0056a r7) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.a(c.l.a.a$a):void");
    }

    private void a(C0056a aVar, int i2) {
        this.f2493f = e(aVar);
        aVar.a(this.f2493f);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.f2490c;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                throw new IOException("Couldn't jump to first Ifd: " + i4);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(c.l.a.a.C0056a r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.a(c.l.a.a$a, int, int):void");
    }

    private void a(C0056a aVar, HashMap hashMap) {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int b2 = bVar.b(this.f2493f);
            int min = Math.min(bVar2.b(this.f2493f), aVar.available() - b2);
            int i3 = this.f2490c;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.f2495h;
            } else {
                if (i3 == 7) {
                    i2 = this.f2496i;
                }
                if (b2 > 0 && min > 0 && this.a == null && this.f2489b == null) {
                    aVar.g((long) b2);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            b2 += i2;
            if (b2 > 0) {
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private void a(InputStream inputStream) {
        for (int i2 = 0; i2 < F.length; i2++) {
            try {
                this.f2491d[i2] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f2490c = a(bufferedInputStream);
        C0056a aVar = new C0056a(bufferedInputStream);
        switch (this.f2490c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                c(aVar);
                break;
            case 4:
                a(aVar, 0, 0);
                break;
            case 7:
                a(aVar);
                break;
            case 9:
                b(aVar);
                break;
            case 10:
                d(aVar);
                break;
        }
        f(aVar);
        a();
    }

    private void a(byte[] bArr, int i2) {
        C0056a aVar = new C0056a(bArr);
        a(aVar, bArr.length);
        b(aVar, i2);
    }

    private boolean a(HashMap hashMap) {
        b bVar;
        b bVar2 = (b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.d(this.f2493f);
        if (Arrays.equals(f2488m, iArr)) {
            return true;
        }
        if (this.f2490c != 3 || (bVar = (b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int b2 = bVar.b(this.f2493f);
        return (b2 == 1 && Arrays.equals(iArr, n)) || (b2 == 6 && Arrays.equals(iArr, f2488m));
    }

    private static boolean a(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = o;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private static long[] a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private b b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < F.length; i2++) {
            b bVar = this.f2491d[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    private void b(C0056a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i2, 5);
        aVar.g((long) i3);
        aVar.a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == A.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b a2 = b.a((int) readShort, this.f2493f);
                b a3 = b.a((int) readShort2, this.f2493f);
                this.f2491d[0].put("ImageLength", a2);
                this.f2491d[0].put("ImageWidth", a3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(c.l.a.a.C0056a r24, int r25) {
        /*
        // Method dump skipped, instructions count: 774
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.a.a.b(c.l.a.a$a, int):void");
    }

    private void b(C0056a aVar, HashMap hashMap) {
        String str;
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (!(bVar == null || bVar2 == null)) {
            long[] a2 = a(bVar.d(this.f2493f));
            long[] a3 = a(bVar2.d(this.f2493f));
            if (a2 == null) {
                str = "stripOffsets should not be null.";
            } else if (a3 == null) {
                str = "stripByteCounts should not be null.";
            } else {
                long j2 = 0;
                for (long j3 : a3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[((int) j2)];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < a2.length; i4++) {
                    int i5 = (int) a2[i4];
                    int i6 = (int) a3[i4];
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    aVar.g((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    aVar.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                    i3 += bArr2.length;
                }
                return;
            }
            Log.w("ExifInterface", str);
        }
    }

    private void b(InputStream inputStream) {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        b bVar = this.f2491d[1].get("PixelXDimension");
        b bVar2 = this.f2491d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f2491d[0].put("ImageWidth", bVar);
            this.f2491d[0].put("ImageLength", bVar2);
        }
        if (this.f2491d[4].isEmpty() && b(this.f2491d[5])) {
            HashMap<String, b>[] hashMapArr = this.f2491d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!b(this.f2491d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private boolean b(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.b(this.f2493f) <= 512 && bVar2.b(this.f2493f) <= 512;
    }

    private boolean b(byte[] bArr) {
        C0056a aVar = new C0056a(bArr);
        this.f2493f = e(aVar);
        aVar.a(this.f2493f);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private void c(C0056a aVar) {
        b bVar;
        a(aVar, aVar.available());
        b(aVar, 0);
        d(aVar, 0);
        d(aVar, 5);
        d(aVar, 4);
        b((InputStream) aVar);
        if (this.f2490c == 8 && (bVar = this.f2491d[1].get("MakerNote")) != null) {
            C0056a aVar2 = new C0056a(bVar.f2507c);
            aVar2.a(this.f2493f);
            aVar2.g(6);
            b(aVar2, 9);
            b bVar2 = this.f2491d[9].get("ColorSpace");
            if (bVar2 != null) {
                this.f2491d[1].put("ColorSpace", bVar2);
            }
        }
    }

    private void c(C0056a aVar, int i2) {
        b bVar;
        b bVar2 = this.f2491d[i2].get("ImageLength");
        b bVar3 = this.f2491d[i2].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f2491d[i2].get("JPEGInterchangeFormat")) != null) {
            a(aVar, bVar.b(this.f2493f), i2);
        }
    }

    private boolean c(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private void d(C0056a aVar) {
        c(aVar);
        if (this.f2491d[0].get("JpgFromRaw") != null) {
            a(aVar, this.f2499l, 5);
        }
        b bVar = this.f2491d[0].get("ISO");
        b bVar2 = this.f2491d[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.f2491d[1].put("PhotographicSensitivity", bVar);
        }
    }

    private void d(C0056a aVar, int i2) {
        b bVar;
        b bVar2;
        StringBuilder sb;
        String arrays;
        b bVar3 = this.f2491d[i2].get("DefaultCropSize");
        b bVar4 = this.f2491d[i2].get("SensorTopBorder");
        b bVar5 = this.f2491d[i2].get("SensorLeftBorder");
        b bVar6 = this.f2491d[i2].get("SensorBottomBorder");
        b bVar7 = this.f2491d[i2].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.a == 5) {
                d[] dVarArr = (d[]) bVar3.d(this.f2493f);
                if (dVarArr == null || dVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(dVarArr);
                } else {
                    bVar2 = b.a(dVarArr[0], this.f2493f);
                    bVar = b.a(dVarArr[1], this.f2493f);
                    this.f2491d[i2].put("ImageWidth", bVar2);
                    this.f2491d[i2].put("ImageLength", bVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) bVar3.d(this.f2493f);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    bVar2 = b.a(iArr[0], this.f2493f);
                    bVar = b.a(iArr[1], this.f2493f);
                    this.f2491d[i2].put("ImageWidth", bVar2);
                    this.f2491d[i2].put("ImageLength", bVar);
                    return;
                }
            }
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            c(aVar, i2);
        } else {
            int b2 = bVar4.b(this.f2493f);
            int b3 = bVar6.b(this.f2493f);
            int b4 = bVar7.b(this.f2493f);
            int b5 = bVar5.b(this.f2493f);
            if (b3 > b2 && b4 > b5) {
                b a2 = b.a(b3 - b2, this.f2493f);
                b a3 = b.a(b4 - b5, this.f2493f);
                this.f2491d[i2].put("ImageLength", a2);
                this.f2491d[i2].put("ImageWidth", a3);
            }
        }
    }

    private boolean d(byte[] bArr) {
        C0056a aVar = new C0056a(bArr);
        this.f2493f = e(aVar);
        aVar.a(this.f2493f);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    private ByteOrder e(C0056a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void f(C0056a aVar) {
        HashMap<String, b> hashMap = this.f2491d[4];
        b bVar = hashMap.get("Compression");
        if (bVar != null) {
            this.f2494g = bVar.b(this.f2493f);
            int i2 = this.f2494g;
            if (i2 != 1) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        return;
                    }
                }
            }
            if (a((HashMap) hashMap)) {
                b(aVar, hashMap);
                return;
            }
            return;
        }
        this.f2494g = 6;
        a(aVar, hashMap);
    }

    public int a(String str, int i2) {
        b b2 = b(str);
        if (b2 == null) {
            return i2;
        }
        try {
            return b2.b(this.f2493f);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public String a(String str) {
        String str2;
        b b2 = b(str);
        if (b2 != null) {
            if (!J.contains(str)) {
                return b2.c(this.f2493f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = b2.a;
                if (i2 == 5 || i2 == 10) {
                    d[] dVarArr = (d[]) b2.d(this.f2493f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                    } else {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].f2511b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].f2511b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].f2511b))));
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + b2.a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(b2.a(this.f2493f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
