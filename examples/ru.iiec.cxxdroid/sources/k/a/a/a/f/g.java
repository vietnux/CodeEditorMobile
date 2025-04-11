package k.a.a.a.f;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public interface g extends FileFilter, FilenameFilter {
    boolean accept(File file);

    boolean accept(File file, String str);
}
