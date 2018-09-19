package com.imooc.io;

import java.io.*;

public class IsrAndOswDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\file.txt");
        InputStreamReader isr = new InputStreamReader(in);

        FileOutputStream out = new FileOutputStream("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test.txt");
        OutputStreamWriter osw = new OutputStreamWriter(out);
//        int c;
//        while ((c = isr.read()) != -1) {
//            System.out.print((char)c);
//        }
        char[] buffer = new char[8*1024];
        int c;
        // 批量读，放入buffer数组，最多放buffer.length
        while ((c = isr.read(buffer, 0, buffer.length)) != -1) {
            String s = new String(buffer, 0, c);
            System.out.println(s);

            osw.write(buffer, 0, c);
            osw.flush();
        }
        osw.close();
        isr.close();
        in.close();
        out.close();
    }
}
