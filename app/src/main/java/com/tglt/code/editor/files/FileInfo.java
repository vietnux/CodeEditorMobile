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
package com.tglt.code.editor.files;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

public class FileInfo implements Serializable {
    private static final long serialVersionUID = 9010790363003271996L;
    public static final int FILE_TYPE = 0;
    public static final int DIRECTORY_TYPE = 1;
    public static final int SYMBOLIC_LINK_TYPE = 2;
    public static final int UNKNOWN_TYPE = 3;
    public static final int USER_ACCESS = 0;
    public static final int GROUP_ACCESS = 1;
    public static final int WORLD_ACCESS = 2;
    public static final int READ_PERMISSION = 0;
    public static final int WRITE_PERMISSION = 1;
    public static final int EXECUTE_PERMISSION = 2;
    private int type = 3;
    private int hardLinkCount;
    private long size = -1L;
    private String rawListing;
    private String user = "";
    private String group = "";
    private String name;
    private String link;
    private Calendar date;
    private final boolean[][] permissions;

    public FileInfo() {
        this.permissions = new boolean[3][3];
    }

    FileInfo(String rawListing) {
        this.permissions = (boolean[][])null;
        this.rawListing = rawListing;
    }

    private char formatType() {
        switch(this.type) {
            case 0:
                return '-';
            case 1:
                return 'd';
            case 2:
                return 'l';
            default:
                return '?';
        }
    }

    public String getGroup() {
        return this.group;
    }

    public int getHardLinkCount() {
        return this.hardLinkCount;
    }

    public String getLink() {
        return this.link;
    }

    public String getName() {
        return this.name;
    }

    public String getRawListing() {
        return this.rawListing;
    }

    public long getSize() {
        return this.size;
    }

    public Calendar getTimestamp() {
        return this.date;
    }

    public int getType() {
        return this.type;
    }


    public String getUser() {
        return this.user;
    }

    public boolean hasPermission(int access, int permission) {
        return this.permissions == null ? false : this.permissions[access][permission];
    }

    public boolean isDirectory() {
        return this.type == 1;
    }

    public boolean isFile() {
        return this.type == 0;
    }

    public boolean isSymbolicLink() {
        return this.type == 2;
    }

    public boolean isUnknown() {
        return this.type == 3;
    }

    public boolean isValid() {
        return this.permissions != null;
    }

    private String permissionToString(int access) {
        StringBuilder sb = new StringBuilder();
        if (this.hasPermission(access, 0)) {
            sb.append('r');
        } else {
            sb.append('-');
        }

        if (this.hasPermission(access, 1)) {
            sb.append('w');
        } else {
            sb.append('-');
        }

        if (this.hasPermission(access, 2)) {
            sb.append('x');
        } else {
            sb.append('-');
        }

        return sb.toString();
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setHardLinkCount(int links) {
        this.hardLinkCount = links;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermission(int access, int permission, boolean value) {
        this.permissions[access][permission] = value;
    }

    public void setRawListing(String rawListing) {
        this.rawListing = rawListing;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void setTimestamp(Calendar date) {
        this.date = date;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String toFormattedString() {
        return this.toFormattedString((String)null);
    }

    public String toFormattedString(String timezone) {
        if (!this.isValid()) {
            return "[Invalid: could not parse file entry]";
        } else {
            StringBuilder sb = new StringBuilder();
            Formatter fmt = new Formatter(sb);
            Throwable var4 = null;

            try {
                sb.append(this.formatType());
                sb.append(this.permissionToString(0));
                sb.append(this.permissionToString(1));
                sb.append(this.permissionToString(2));
                fmt.format(" %4d", this.getHardLinkCount());
                fmt.format(" %-8s %-8s", this.getUser(), this.getGroup());
                fmt.format(" %8d", this.getSize());
                Calendar timestamp = this.getTimestamp();
                if (timestamp != null) {
                    if (timezone != null) {
                        TimeZone newZone = TimeZone.getTimeZone(timezone);
                        if (!newZone.equals(timestamp.getTimeZone())) {
                            Date original = timestamp.getTime();
                            Calendar newStamp = Calendar.getInstance(newZone);
                            newStamp.setTime(original);
                            timestamp = newStamp;
                        }
                    }

                    fmt.format(" %1$tY-%1$tm-%1$td", timestamp);
                    if (timestamp.isSet(11)) {
                        fmt.format(" %1$tH", timestamp);
                        if (timestamp.isSet(12)) {
                            fmt.format(":%1$tM", timestamp);
                            if (timestamp.isSet(13)) {
                                fmt.format(":%1$tS", timestamp);
                                if (timestamp.isSet(14)) {
                                    fmt.format(".%1$tL", timestamp);
                                }
                            }
                        }

                        fmt.format(" %1$tZ", timestamp);
                    }
                }

                sb.append(' ');
                sb.append(this.getName());
            } catch (Throwable var16) {
                var4 = var16;
                throw var16;
            } finally {
                if (fmt != null) {
                    if (var4 != null) {
                        try {
                            fmt.close();
                        } catch (Throwable var15) {
                            var4.addSuppressed(var15);
                        }
                    } else {
                        fmt.close();
                    }
                }

            }

            return sb.toString();
        }
    }

    public String toString() {
        return this.getRawListing();
    }
}
