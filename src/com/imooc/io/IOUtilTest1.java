package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class IOUtilTest1 {

    public static void main(String[] args) throws IOException {
        File src = new File("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\file.txt");
        File dest = new File("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test.txt");

        IOUtil.copyFile(src, dest);
    }
}
