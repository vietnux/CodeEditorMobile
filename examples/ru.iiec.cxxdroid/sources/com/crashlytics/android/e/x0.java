package com.crashlytics.android.e;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

final class x0 {
    private static final FilenameFilter a = new a();

    static class a implements FilenameFilter {
        a() {
        }

        public boolean accept(File file, String str) {
            return true;
        }
    }

    static int a(File file, int i2, Comparator<File> comparator) {
        return a(file, a, i2, comparator);
    }

    static int a(File file, FilenameFilter filenameFilter, int i2, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        Arrays.sort(listFiles, comparator);
        for (File file2 : listFiles) {
            if (length <= i2) {
                return length;
            }
            file2.delete();
            length--;
        }
        return length;
    }
}
