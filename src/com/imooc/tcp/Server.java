package com.imooc.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("...服务器即将启动，等待客户端连接...");
            Socket socket = null;
            int count = 0;
            while (true) {
                count++;
                socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.run();
                System.out.println("客户端的数量：" + count);
                InetAddress address = socket.getInetAddress();
                System.out.println("客户端IP：" + address.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
