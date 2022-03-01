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
import android.graphics.drawable.Drawable;
import android.util.Log;

import java.io.File;
import java.io.Serializable;

public class ClientInfo implements Serializable {
    private String name;
    private String host;
    private String username;
    private String password;
    private int type;
    private int port;
    private String remoteDirectory;
    private boolean connect = false;

    public ClientInfo(String name, String host, String username, String password, int type, int port, String remoteDirectory) {
        this.name = name;
        this.host = host;
        this.username = username;
        this.password = password;
        this.type = type;
        this.port = (int)port;
        this.remoteDirectory = !remoteDirectory.isEmpty() || remoteDirectory != "" || remoteDirectory!=null ? remoteDirectory : "/";
    }

    public String getName() {
        return name;
    }

    public String getHost() {
        return host;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() { return password; }
    public int getType() {
        return type;
    }
    public int getPort() {
        return port;
    }
    public String getRemoteDirectory() {
        return remoteDirectory;
    }
    public void setRemoteDirectory(String reDirectory) {
        remoteDirectory = reDirectory;
    }
    public boolean isConnect() {
        return connect;
    }
    public void setConnect(boolean con) {
        connect = con;
    }
    //(String name, String host, String username, String password, int type, int port, String remoteDirectory)
    public String toString() {
        return getName() + "##" + getHost() + "##" + getUsername() + "##" + getPassword() + "##" + getType() + "##" + getPort() + "##" + getRemoteDirectory() + "##" ;
    }

}
