package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo1 {
    public static void main(String[] args) throws IOException {
        // 如果不存在创建，如果存在追加 true追加，否则清空
        FileOutputStream out = new FileOutputStream("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test.txt", true);
        out.write('A');
        out.write('B'); // 写低八位
        int a = 10; // int需要写四次每次8位
        out.write(a >>> 24);
        out.write(a >>> 16);
        out.write(a >>> 8);
        out.write(a);
        byte[] gbk = "中国".getBytes("utf-8");
        out.write(gbk);
        out.close();

        IOUtil.printHex("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test.txt");
    }
}
