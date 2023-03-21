package com.itsjxixi.internet.main.tcp.demo3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1.
        ServerSocket ss = new ServerSocket(25560);

        // 2.
        Socket s = ss.accept();

        // 3.
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        DataOutputStream Dos = new DataOutputStream(s.getOutputStream());

        // 4.
        User u = (User)ois.readObject();
        System.out.println("我是服务器，收到的消息是：" + u);

        // 5.
        boolean b = false;
        if ("a".equals(u.getUsername()) && "123".equals(u.getPassword())) {
            b = true;
        }

        Dos.writeBoolean(b);

        Dos.close();
        ois.close();
        s.close();
        ss.close();
    }
}
