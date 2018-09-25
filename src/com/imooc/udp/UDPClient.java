package com.imooc.udp;

import java.io.IOException;
import java.net.*;

import static java.awt.SystemColor.info;

public class UDPClient {

    public static void main(String[] args) throws IOException {
        // 1.指定服务器信息，地址 端口号 数据
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8800;
        byte[] data = "用户名：admin，密码：123".getBytes();
        // 2.创建数据报，包含数据信息
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);

        byte[] data2 = new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
        socket.receive(packet2);

        String reply = new String(data2, 0, packet2.getLength());
        System.out.println("我是客户端，服务端说：" + reply);

        socket.close();
    }
}
