package com.xiaoyv.javaengine.compile;

import androidx.annotation.NonNull;

import com.xiaoyv.dex.Dex;
import com.xiaoyv.dx.command.dexer.DxContext;
import com.xiaoyv.dx.merge.CollisionPolicy;
import com.xiaoyv.dx.merge.DexMerger;
import com.xiaoyv.javaengine.compile.listener.CompilerListener;
import com.xiaoyv.javaengine.utils.FileUtils;
import com.xiaoyv.javaengine.utils.StringUtils;
import com.xiaoyv.javaengine.utils.ThreadUtils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Dex转换类
 * <p>
 * 将class文件或者jar文件转换为dex文件
 */
public class DexCompiler {


    /**
     * 根据文件路径执行转换操作
     *
     * @param sourceFile       待转换文件的路径
     * @param distFile         转换目标文件（xxx.dex）的路径
     * @param compilerListener 转换结果监听器
     */
    public void compile(@NonNull String sourceFile, @NonNull String distFile, @NonNull CompilerListener compilerListener) {
        compile(new File(sourceFile), new File(distFile), compilerListener);
    }


    /**
     * 根据文件执行转换操作
     *
     * @param sourceFile       待转换文件
     * @param distFile         转换至目标文件（xxx.dex）
     * @param compilerListener 转换结果监听
     */
    public void compile(@NonNull final File sourceFile, @NonNull final File distFile, @NonNull final CompilerListener compilerListener) {
        // 在线程中执行转换操作
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Object>() {
            @Override
            public Object doInBackground() throws Throwable {
                // 待转换文件不存在
                if (!FileUtils.isFileExists(sourceFile)) {
                    throw new Exception("The class file or jar file to be converted does not exist：" + sourceFile.getAbsolutePath());
                }

                // 删除并创建目标转换空白dex文件
                boolean create = FileUtils.createFileByDeleteOldFile(distFile);
                // 权限错误
                if (!create) {
                    throw new Exception("Convert blank dex file without creating target, please check permissions：" + distFile.getAbsolutePath());
                }

                // 转换命令
                String[] compileCmd = new String[]{
                        "--dex",
                        "--verbose",
                        "--no-strict",
                        "--no-files",
                        "--min-sdk-version=28",
                        "--output=" + distFile.getAbsolutePath(),
                        sourceFile.getAbsolutePath()
                };

                new Thread(() -> {

                });
                // 开始转换dex
                com.xiaoyv.dx.command.Main.main(compileCmd);

                // 返回转换后的dex文件路径
                return distFile.getAbsolutePath();
            }

            @Override
            public void onFail(Throwable t) {
                compilerListener.onError(t);
            }

            @Override
            public void onSuccess(Object result) {
                compilerListener.onSuccess(String.valueOf(result));
            }
        });
    }


    /**
     * 将多个jar或class文件分别转换至 saveDexFolder 文件夹下
     *
     * @param jarList          待转换的类文件或jar文件集合
     * @param saveDexFolder    保存目录
     * @param compilerListener 转换监听器
     */
    public void compile(@NonNull final List<File> jarList, @NonNull final File saveDexFolder, @NonNull final CompilerListener compilerListener) {

        // 在线程中执行转换操作
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Object>() {
            @Override
            public Object doInBackground() throws Throwable {
                // 待转换文件集合空
                if (jarList.isEmpty()) {
                    throw new Exception("The jar or class collection to be converted is empty");
                }


                // 转换前检查储存文件夹是否存在
                boolean create = FileUtils.createOrExistsDir(saveDexFolder);
                // 权限错误
                if (!create) {
                    throw new Exception("No folder created to save dex files, please check permissions：" + saveDexFolder.getAbsolutePath());
                }

                // 删除保存目录已经存在的内容
                FileUtils.deleteAllInDir(saveDexFolder);


                // 转换后的Dex文件路径集合
                final List<String> newDexFiles = new ArrayList<>();
                // 循环转换
                for (int i = 0; i < jarList.size(); i++) {
                    File file = jarList.get(i);
                    // 先检测jar文件是否变化，未变化则不转换为dex
                    String fileMd5 = FileUtils.getFileMD5ToString(file);
                    String newDexFile = saveDexFolder.getAbsolutePath() + "/" + fileMd5.toLowerCase() + ".dex";
                    // 目标转换dex文件存在时，检验
                    if (FileUtils.isFileExists(newDexFile) && newDexFile.length() > 0) {
                        System.out.println("Dex has been converted length：" + newDexFile.length());
                        newDexFiles.add(newDexFile);
                        continue;
                    }
                    // 将新生成的dex文件加到集合
                    newDexFiles.add(newDexFile);

                    // 创建目标转换空白dex文件
                    FileUtils.createFileByDeleteOldFile(newDexFile);

                    // 转换命令
                    String[] compileCmd = new String[]{
                            "--dex",
                            "--verbose",
                            "--no-strict",
                            "--no-files",
                            "--min-sdk-version=26",
                            "--output=" + newDexFile,
                            file.getAbsolutePath()
                    };
                    // 开始转换dex
                    com.xiaoyv.dx.command.Main.main(compileCmd);
                }

                // 删除掉旧的Dex文件(不在当前转换集合的文件将被删除)
                FileUtils.deleteFilesInDirWithFilter(saveDexFolder.getAbsolutePath(), new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        boolean isDelete = true;
                        for (String path : newDexFiles) {
                            if (StringUtils.equals(path, pathname.getAbsolutePath())) {
                                isDelete = false;
                            }
                        }
                        return isDelete;
                    }
                });

                // 返回保存dex文件的文件夹路径
                return saveDexFolder.getAbsolutePath();
            }

            /**
             * 这里过滤转换错误的文件（定制了一个错误）
             * 请看{@link com.xiaoyv.dx.command.dexer.Main .main()方法}
             */
            @Override
            public void onFail(Throwable t) {
                if (t instanceof Error) {
                    Throwable cause = t.getCause();
                    if (cause != null) {
                        String errorFile = cause.getMessage();
                        // 删除已转换的半成品文件
                        String fileMd5 = FileUtils.getFileMD5ToString(errorFile);
                        String newDexFile = saveDexFolder.getAbsolutePath() + "/" + fileMd5.toLowerCase() + ".dex";
                        FileUtils.delete(newDexFile);
                    }
                }
                compilerListener.onError(t);
            }

            @Override
            public void onSuccess(Object result) {
                compilerListener.onSuccess(String.valueOf(result));
            }
        });
    }


    /**
     * 合并多个dex
     *
     * @param dexFiles         dex文件集合
     * @param distDexFile      目标dex空白文件
     * @param compilerListener 转换监听器
     */
    public void mergerDex(@NonNull final List<File> dexFiles, @NonNull final File distDexFile, @NonNull final CompilerListener compilerListener) {
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Object>() {
            @Override
            public Object doInBackground() throws Throwable {

                // 删除并创建目标转换空白dex文件
                boolean create = FileUtils.createFileByDeleteOldFile(distDexFile);
                // 权限错误
                if (!create) {
                    throw new Exception("Convert blank dex file without creating target, please check permissions：" + distDexFile.getAbsolutePath());
                }

                if (dexFiles.size() != 0) {
                    Dex[] toBeMerge = new Dex[dexFiles.size()];
                    for (int i = 0; i < dexFiles.size(); i++) {
                        toBeMerge[i] = new Dex(dexFiles.get(i));
                    }
                    DexMerger dexMerger = new DexMerger(toBeMerge, CollisionPolicy.FAIL, new DxContext());
                    Dex merged = dexMerger.merge();
                    if (merged != null) {
                        merged.writeTo(distDexFile);
                    }
                    return distDexFile.getAbsolutePath();
                } else {
                    throw new Exception("Dex merge error: No dex file that can be merged was found");
                }
            }

            @Override
            public void onFail(Throwable t) {
                compilerListener.onError(t);
            }

            @Override
            public void onSuccess(Object result) {
                compilerListener.onSuccess(String.valueOf(result));
            }
        });

    }
}
