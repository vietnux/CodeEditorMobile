package d;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import qwe.qweqwe.texteditor.i0;

public class b {

    public interface a {
        void a(int i2, int i3);
    }

    public static String a(Context context, String str) {
        InputStream inputStream;
        if (str.startsWith("assets://")) {
            inputStream = context.getAssets().open(str.substring(9));
        } else {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.connect();
            inputStream = httpURLConnection.getInputStream();
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine + "\n");
        }
    }

    public static ArrayList<String> a(JSONObject jSONObject, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static void a(String str, File file, a aVar) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.connect();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        InputStream inputStream = httpURLConnection.getInputStream();
        int contentLength = httpURLConnection.getContentLength();
        byte[] bArr = new byte[1024];
        int i2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
                i2 += read;
                if (aVar != null) {
                    aVar.a(i2, contentLength);
                }
            } else {
                fileOutputStream.close();
                return;
            }
        }
    }

    public static String b(Context context, String str) {
        try {
            return c(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String c(Context context, String str) {
        InputStream inputStream;
        if (str.startsWith("assets://")) {
            inputStream = context.getAssets().open(str.substring(9));
        } else {
            i0.c("APIHelpers", "getJSON: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.getRequestProperties();
            httpURLConnection.connect();
            inputStream = httpURLConnection.getInputStream();
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return stringBuffer.toString();
            }
            stringBuffer.append(readLine);
        }
    }
}
