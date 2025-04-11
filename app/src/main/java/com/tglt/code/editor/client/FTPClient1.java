/*
 *   Copyright 2020-2021 Rosemoe
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.tglt.code.editor.client;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;
import org.apache.commons.net.ftp.FTPReply;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.nio.channels.FileChannel;

import com.tglt.code.editor.app.FragmentEditor;
import com.tglt.code.editor.files.FileInfo;

public class FTPClient1 extends Client {

    Context context;
    private static String host = "ftpupload.net";
    private static String username = "unaux_29313453";
    private static String password = "hoqp7d4yp";
    private static int post = 21;
    private static String remoteDirectory = "/";
    public static File photo_file;
    public static FTPClient ftpClient = null;
    public static FTPFile[] files = null;
    public static String message = "";

    public FTPClient1(ClientInfo info) {
        super(info);
        host = info.getHost();
        username = info.getUsername();
        password = info.getPassword();
        remoteDirectory = info.getRemoteDirectory();
        post = info.getPort();
        ftpClient = new FTPClient();
        message = "";
    }

    @Override
    public void connect()  {
//        Log.e("FTP", "=== "+host );
        try {
            if( ftpClient == null || !ftpClient.isConnected() ) {
                ftpClient.connect(InetAddress.getByName(host), post);
                ftpClient.login(username, password);
            }
            ftpClient.changeWorkingDirectory(remoteDirectory);
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);


//                    BufferedInputStream buffIn = null;
//                    buffIn = new BufferedInputStream(new FileInputStream(file));
//                    ftpClient.enterLocalPassiveMode();
//                    ftpClient.storeFile("test.txt", buffIn);
//                    buffIn.close();

            //https://commons.apache.org/proper/commons-net/apidocs/org/apache/commons/net/ftp/FTPClient.html
            //https://mail.codejava.net/java-se/ftp/java-ftp-list-files-and-directories-example
            files = ftpClient.listFiles();
//                    FTPListParseEngine engine = ftpClient.initiateListParsing("com.whatever.YourOwnParser", directory);
//                    FTPListParseEngine engine = ftpClient.initiateListParsing( "/");
//                    while (engine.hasNext()) {
//                        FTPFile[] files = engine.getNext(25);  // "page size" you want
//                        //do whatever you want with these files, display them, etc.
//                        //expensive FTPFile objects not created until needed.
//
//                    }
            for(int i=0; i<files.length; i++ ) {
//                Log.e("FTPClient", files[i].toString());
                FileInfo f = new FileInfo();
                f.setLink( (files[i].getLink() != null ? files[i].getLink() : remoteDirectory+ "/" +files[i].getName()).replace("//", "/") );
                f.setName( files[i].getName() );
                f.setSize( files[i].getSize() );
                f.setUser( files[i].getUser() );
                f.setGroup( files[i].getGroup() );
                f.setType( files[i].getType() );
                f.setTimestamp( files[i].getTimestamp() );
                setClientsListFile( f );
            }
//                    Log.e("FTPClient", " === " + files.length );
//                    ftpClient.logout();
//                    ftpClient.disconnect();
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            message = e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
    }
    public boolean isConnect() {
        return ftpClient.isConnected();
    }
    public void close() {
        try {
            ftpClient.disconnect();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    /**
     * http://kodehelp.com/java-program-for-uploading-file-to-sftp-server/
     *
//     * @param server
//     * @param userName
//     * @param openSSHPrivateKey
//     * @param remoteDir
//     * @param localDir
//     * @param localFileName
     * @throws IOException
     */
    public void UploadFile(final Context con, final FragmentEditor fEditor) {
        if( ftpClient == null  ){
            return;
        }
//        Log.e("Start Upload Process", "ftp Start Upload Process 11");
        new AsyncTask<Void, Void, Void>() {
            private File createFileFromInputStream(InputStream inputStream, String fileName) {
                File keyFile = null;
                try {
                    keyFile = new File(con.getCacheDir() + "/" + fileName);
                    if (!keyFile.exists() || !keyFile.canRead()) {
                        OutputStream outputStream = new FileOutputStream( keyFile);

                        String content = fEditor.getTabEditor().getText().toString();
                        outputStream.write(content.getBytes());

                        outputStream.close();
                        inputStream.close();
                    }
                } catch (IOException e) {
                    // Logging exception
                    Log.e("error", e + "");

                }

                return keyFile;
            }

            @Override
            protected Void doInBackground(Void... params) {
                FileInputStream fis = null;
                OutputStream os = null;
                try {
//                    if( ftpClient == null || !ftpClient.isConnected() ) {
                        ftpClient.connect(InetAddress.getByName(host));
                        ftpClient.login(username, password);
                        ftpClient.changeWorkingDirectory(remoteDirectory);

//                        Log.e("Upload Process", "ftp connect ");
//                    }

                    File file = createFileFromInputStream(fEditor.getTabInputStream(), fEditor.getTabName());

//                    long currentFilelength = f.length();
                    fis = new FileInputStream(file);
//                    FileOutputStream fos = new FileOutputStream(file);
                    ftpClient.sendNoOp();//used so server timeout exception will not rise
                    int reply = ftpClient.getReplyCode();
                    if (!FTPReply.isPositiveCompletion(reply))
                    {
                        ftpClient.disconnect();
                        return null;
                    }
//                    ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
                    ftpClient.enterLocalPassiveMode();
                    ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                    boolean status = ftpClient.storeFile(fEditor.getTabName(), fis);
//                    boolean status = ftpClient.retrieveFile(fEditor.getTabName(), fos);
                    fis.close();
                    file.delete();

//                    Log.e("Upload Process", "ftp Start Upload Process "+status );

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (OutOfMemoryError e) {
                    e.printStackTrace();
                } catch (Exception e) {
//                    Log.e("Start Upload Process", "ftp Start Upload Process "+e.getMessage());
                    e.printStackTrace();
                } finally {
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    if (os != null) {
                        try {
                            os.close();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
                return null;
            };
        }.execute();

    }

    /**
     *
     * http://kodehelp.com/java-program-for-downloading-file-from-sftp-server/
     *
//     * @param server
//     * @param userName
//     * @param openSSHPrivateKey
//     * @param remoteDir
//     * @param remoteFile
//     * @param localDir
     * @throws IOException
     */
    public static File DownloadFile(final Context con) {
        if( ftpClient == null  ){
            return null;
        }

        new AsyncTask<Void, Void, Void>() {

            private File createFileFromInputStream(InputStream inputStream, String fileName) {
                File keyFile = null;
                try {
                    keyFile = new File(con.getCacheDir() + "/" + fileName);
                    if (!keyFile.exists() || !keyFile.canRead()) {
                        OutputStream outputStream = new FileOutputStream(  keyFile);
                        byte buffer[] = new byte[1024];
                        int length = 0;

                        while ((length = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, length);
                        }

                        outputStream.close();
                        inputStream.close();
                    }
                } catch (IOException e) {
                    // Logging exception
                    Log.e("error", e + "");

                }

                return keyFile;
            }

            @Override
            protected Void doInBackground(Void... params) {
                // TODO Auto-generated method stub
                File newFile = null;
                try {
                    // APPROACH #1: using retrieveFile(String, OutputStream)
                    String remoteFile1 = "/test/video.mp4";
                    File downloadFile1 = new File("D:/Downloads/video.mp4");
                    OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
                    boolean success = ftpClient.retrieveFile(remoteFile1, outputStream1);
                    outputStream1.close();

                    if (success) {
                        System.out.println("File #1 has been downloaded successfully.");
                    }

                    // APPROACH #2: using InputStream retrieveFileStream(String)
                    String remoteFile2 = "/test/song.mp3";
                    File downloadFile2 = new File("D:/Downloads/song.mp3");
                    OutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream(downloadFile2));
                    InputStream inputStream = ftpClient.retrieveFileStream(remoteFile2);
                    byte[] bytesArray = new byte[4096];

                    int bytesRead = -1;
                    while ((bytesRead = inputStream.read(bytesArray)) != -1) {
                        outputStream2.write(bytesArray, 0, bytesRead);
                    }

                    success = ftpClient.completePendingCommand();
                    if (success) {
                        System.out.println("File #2 has been downloaded successfully.");
                    }
                    outputStream2.close();
                    inputStream.close();

                } catch (IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                    ex.printStackTrace();
                } finally {
                    try {
                        if (ftpClient.isConnected()) {
                            ftpClient.logout();
                            ftpClient.disconnect();
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                return null;
            };
        }.execute();
        return null;

    }

    public static String FileSaveInLocalSDCard(File file) {
        // TODO Auto-generated method stub
        String imagePath = "";
        File mf = Environment.getExternalStorageDirectory();
        String storePath = mf.getAbsoluteFile() + "/Splash/upload/";

        File dirFile = new File(storePath);
        dirFile.mkdirs();
        File destfile = new File(dirFile, file.getName());
        imagePath = storePath + file.getName();
        try {
            boolean copyFileValue = copyFile(file, destfile);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return imagePath;
    }

    public static Boolean copyFile(File sourceFile, File destFile) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();

            FileChannel source = null;
            FileChannel destination = null;
            try {
                source = new FileInputStream(sourceFile).getChannel();
                destination = new FileOutputStream(destFile).getChannel();
                destination.transferFrom(source, 0, source.size());
            } finally {
                if (source != null)
                    source.close();
                if (destination != null)
                    destination.close();
            }
            return true;
        }
        return false;
    }

    public InputStream inputFile(final Context con, String remoteFile) {
        if( ftpClient == null  ){
            return null;
        }

//        Log.e("FTPclient", "Error: ok vào "+remoteFile);
        InputStream inputStream;
        try {
            // APPROACH #2: using InputStream retrieveFileStream(String)
            inputStream = ftpClient.retrieveFileStream(remoteFile);
            return inputStream;
        } catch (Exception ex) {
            Log.e("FTPclient", "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
//                finally {
//                    try {
//                        if (ftpClient.isConnected()) {
//                            ftpClient.logout();
//                            ftpClient.disconnect();
//                        }
//                    } catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//                }
        return null;
    }
}