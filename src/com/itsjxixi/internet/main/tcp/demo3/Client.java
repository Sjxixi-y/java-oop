package com.itsjxixi.internet.main.tcp.demo3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1.
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 25560);

        // 2.
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        // 3.
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String  username  = input.nextLine();
        System.out.println("请输入密码");
        String password = input.nextLine();
        User user = new User(username,password);

        oos.writeObject(user);

        if (dis.readBoolean()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }

        oos.close();
        dis.close();
        socket.close();
    }
}
