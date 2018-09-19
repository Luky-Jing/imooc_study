package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileUtileTest1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        File src = new File("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\file.txt");
        File dest = new File("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test.txt");
        IOUtil.copyFileByBuffer(src, dest);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
