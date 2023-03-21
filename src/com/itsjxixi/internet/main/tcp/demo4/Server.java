package com.itsjxixi.internet.main.tcp.demo4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1.
        ServerSocket ss = new ServerSocket(2019);

        // 2.
        Socket accept = ss.accept();

        // 3.

    }
}
