package com.imooc.io;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "慕课网ABC";
        byte[] bytes1 = s.getBytes("utf-8"); //utf-8
        for (byte b: bytes1
             ) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        byte[] bytes2 = s.getBytes("gbk"); //utf-8
        for (byte b: bytes2
        ) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        byte[] bytes3 = s.getBytes("utf-16be"); //utf-8
        for (byte b: bytes3
        ) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        String str1 = new String(bytes2);
        System.out.println(str1);
    }
}
