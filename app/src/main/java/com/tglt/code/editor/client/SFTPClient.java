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
import android.os.ParcelFileDescriptor;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import com.tglt.code.editor.app.FragmentEditor;
import com.tglt.code.editor.files.FileInfo;

public class SFTPClient extends Client {

    private static String host = "103.24.246.60";
    private static String username = "root";
    private static String password = "";
    private static int post = 21;
    private static String remoteDirectory = "/var/www/html";
    public static File photo_file;
    public static ChannelSftp sftp = null;
    public static JSch ssh = null;
    public static Session session = null;
    public static String message = "";

    public SFTPClient(ClientInfo info) {
        super(info);
        host = info.getHost();
        username = info.getUsername();
        password = info.getPassword();
        remoteDirectory = info.getRemoteDirectory();
        post = info.getPort();
        ssh = new JSch();
        message = "";
    }
    @Override
    public void connect()  {
        try {
//            Log.e("SFTPClient", host);
//            if( sftp == null ) {
                java.util.Properties config = new java.util.Properties();
                config.put("StrictHostKeyChecking", "no");

                session = ssh.getSession(username, host, post);
                session.setPassword(password);
                session.setConfig(config);
                session.setConfig("PreferredAuthentications", "password");

                session.connect();
                System.gc();

                sftp = (ChannelSftp) session.openChannel("sftp");
                sftp.connect();
//            }
            sftp.cd(remoteDirectory);

//                    Log.e("SFTPClient", sftp.pwd());
            Vector ls = sftp.ls(remoteDirectory);
            for(int i=0; i<ls.size(); i++ ) {
//                        Log.e("SFTPClient", i+": "+ls.get(i).toString());
                ChannelSftp.LsEntry lsEn = ((ChannelSftp.LsEntry)ls.get(i));
                FileInfo f = new FileInfo();
                f.setLink( (remoteDirectory+"/"+lsEn.getFilename()).replace("//", "/") );
                f.setName( lsEn.getFilename() );
                f.setSize( lsEn.getAttrs().getSize() );
                f.setUser( ""+lsEn.getAttrs().getUId() );
                f.setGroup( ""+lsEn.getAttrs().getGId() );
//                        String ex = lsEn.getAttrs().getExtended();
                f.setType( lsEn.getAttrs().isDir() ? 1 : 0 );
//                        f.setTimestamp( lsEn.getAttrs().getMTime() );
                setClientsListFile( f );
//                        Log.e("SFTPClient", f.toString() +" : "+lsEn.getAttrs().getExtended()  + " = "+ lsEn.getFilename());
            }

//                    sftp.disconnect();
//                    session.disconnect();
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            message = e.getMessage();
        } catch (JSchException e) {
            e.printStackTrace();
            message = e.getMessage();
            Log.e("message", e.getMessage() );
        } catch (SftpException e) {
            e.printStackTrace();
            message = e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
    }
    public boolean isConnect() {
        if( sftp!=null )
            return sftp.isConnected();
        return false;
    }
    public void close() {
        if( sftp!=null ) {
            sftp.disconnect();
            session.disconnect();
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
        if( sftp == null  ){
            return;
        }
//        Log.e("Start Upload Process", "sftp Start Upload Process");
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
//                    JSch ssh = new JSch();

//                    AssetManager am = con.getAssets();
//                    InputStream inputStream = am.open("splash_openssh.ppk");
                    File file = createFileFromInputStream(fEditor.getTabInputStream(), fEditor.getTabName());
//                    ParcelFileDescriptor pfd = con.getContentResolver().openFileDescriptor(f, "w");
//                    if( pfd != null ) {
//                        FileOutputStream file = new FileOutputStream(pfd.getFileDescriptor());
//                        file.write(content.getBytes());
////                        file.close();
//                    }
//                    File file = f;


//                    String path = file + "";
//                    ssh.addIdentity(path);

//                    Session session = jsch.getSession(username, host, post);
//                    java.util.Properties config = new java.util.Properties();
//                    config.put("StrictHostKeyChecking", "no");
//                    session.setConfig(config);
////                    session.setPassword(password);
//                    session.connect();
//                    System.out.println("JSch JSch Session connected.");
//                    System.out.println("Opening Channel.");
                    System.gc();
//                    ChannelSftp channelSftp = null;
//                    channelSftp = (ChannelSftp) session.openChannel("sftp");
//                    channelSftp.connect();
                    sftp.cd(remoteDirectory);

//                    long currentFilelength = f.length();
                    fis = new FileInputStream(file);
                    sftp.put(fis, fEditor.getTabName() );

                    file.delete();
//                    Log.e("Start Upload Process", "Start Upload Process");

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (OutOfMemoryError e) {
                    e.printStackTrace();
//                } catch (JSchException e) {
//                    e.printStackTrace();
                } catch (SftpException e) {
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
    public static File sftpDownloadFile_keyAuthentication_jsch(final Context con) throws IOException {

        new AsyncTask<Void, Void, Void>() {

            private File createFileFromInputStream(InputStream inputStream,
                                                   String fileName) {
                File keyFile = null;
                try {
                    keyFile = new File(con.getCacheDir() + "/" + fileName);
                    if (!keyFile.exists() || !keyFile.canRead()) {
                        OutputStream outputStream = new FileOutputStream(
                                keyFile);
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
                    // JSch jsch = new JSch();
                    // String password =
                    // "/storage/sdcard0/Splash/splash_openssh.ppk";
                    // System.out.println(password);
                    // jsch.addIdentity(password);
                    JSch jsch = new JSch();

                    AssetManager am = con.getAssets();
                    InputStream inputStream;

                    inputStream = am.open("splash_openssh.ppk");

                    File file = createFileFromInputStream(inputStream, "splash_openssh.ppk");

                    if (file.exists()) {
                        System.out.println(file + "");
                    } else {
                        System.out.println(file + "");
                    }

                    String path = file + "";
                    jsch.addIdentity(path);
                    Session session = jsch.getSession(username, host, 22);
                    java.util.Properties config = new java.util.Properties();
                    config.put("StrictHostKeyChecking", "no");
                    session.setConfig(config);
                    session.connect();
                    Channel channel = session.openChannel("sftp");
                    channel.setOutputStream(System.out);
                    channel.connect();
                    ChannelSftp channelSftp = (ChannelSftp) channel;
                    channelSftp.cd(remoteDirectory);

                    byte[] buffer = new byte[1024];
                    File mf = Environment.getExternalStorageDirectory();

                    BufferedInputStream bis = new BufferedInputStream(
                            channelSftp.get("269-twitter.jpg"));
                    newFile = new File(
                            Environment.getExternalStorageDirectory()
                                    + "/Splash/upload/", "splash_img1.jpg");

                    OutputStream os = null;

                    os = new FileOutputStream(newFile);
                    BufferedOutputStream bos = new BufferedOutputStream(os);
                    int readCount;
                    while ((readCount = bis.read(buffer)) > 0) {
                        System.out.println("Writing: ");
                        bos.write(buffer, 0, readCount);
                    }
                    bos.close();

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (OutOfMemoryError e) {
                    e.printStackTrace();
                } catch (JSchException e) {
                    e.printStackTrace();
                } catch (SftpException e) {
                    e.printStackTrace();
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
        if( sftp == null  ){
            return null;
        }

        Log.e("sFTPclient", "Error: ok vào "+remoteFile);
        InputStream inputStream;
        try {
            // APPROACH #2: using InputStream retrieveFileStream(String)
//            AssetManager am = con.getAssets();
//            inputStream = am.open(remoteFile);

            inputStream = new BufferedInputStream(
                    sftp.get(remoteFile));

            return inputStream;
        } catch (Exception ex) {
//            Log.e("FTPclient", "Error: " + ex.getMessage());
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