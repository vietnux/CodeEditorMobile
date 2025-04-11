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
import android.net.Uri;

import org.apache.commons.net.ftp.FTPFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.tglt.code.editor.app.FragmentEditor;
import com.tglt.code.editor.files.FileInfo;

public class Client {

    Context context;
    private static String host = "ftpupload.net";
    private static String username = "unaux_29313453";
    private static String password = "hoqp7d4yp";
    private static int post = 21;
    private static String remoteDirectory = "/";
    private List<FileInfo> clientsListFile = new ArrayList<>();
    public static String message = "";

    public Client(ClientInfo info) {
        host = info.getHost();
        username = info.getUsername();
        password = info.getPassword();
        remoteDirectory = info.getRemoteDirectory();
        post = info.getPort();
        message = "";
    }

    public void connect()  { }
    public boolean isConnect()  { return false;}
    public void close()  { }

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


        return null;
    }

    static String FileSaveInLocalSDCard(File file) {

        return null;
    }

    public static Boolean copyFile(File sourceFile, File destFile) throws IOException {

        return null;
    }
    public List<FileInfo> getClientsListFile(){
        return clientsListFile;
    }
    public void setClientsListFile(FileInfo f){
        clientsListFile.add( f );
    }

    public InputStream inputFile(final Context con, String remoteFile) {
        return null;
    }
}