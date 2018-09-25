package com.imooc.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        byte[] bytes = address.getAddress();
        System.out.println(Arrays.toString(bytes));
        System.out.println(address);

        InetAddress address2 = InetAddress.getByName("ZB-PF0V855M");
        System.out.println(address2.getHostName());
        System.out.println(address2.getHostAddress());
    }
}
