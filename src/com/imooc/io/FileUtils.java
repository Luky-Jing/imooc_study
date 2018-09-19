package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileUtils {

    public static void listDirectory(File dir) throws IOException {
        if (!dir.exists()) {
            throw new IllegalArgumentException("目录：" + dir + "不存在。");
        }

        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录");
        }
//        String[] filenames = dir.list();
//        for (String filename: filenames
//             ) {
////            System.out.println(filename);
//            System.out.println(dir + "\\" + filename);
//        }

        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files
            ) {
                if (file.isDirectory()) {
                    listDirectory(file);
                } else {
                    System.out.println(dir + "\\" + file);
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
