package org.example.common;

public class ServerInfo {
    public static final int port = 3000;
    public static final String ip = "localhost";

    public static String info() {
        return ip + ":" + port;
    }
}
