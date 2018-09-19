package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\file.txt");
        System.out.println(file.exists());
//        if (!file.exists()) {
//            file.mkdir();
//        } else {
//            file.delete();
//        }
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File file2 = new File("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\file2.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                System.out.println(file2);
                System.out.println(file2.getName());
                System.out.println(file2.getParent());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            file2.delete();
        }
    }
}
