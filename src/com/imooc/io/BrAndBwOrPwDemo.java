package com.imooc.io;

import java.io.*;

public class BrAndBwOrPwDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\file.txt")
                )
        );

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test.txt")
                )
        );
        PrintWriter pw = new PrintWriter("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test1.txt");
//        PrintWriter pw2 = new PrintWriter(FileOutputStream outputstream, boolean autoFlush);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line); // 一次读一行，并不能识别换行
            bw.write(line);
            // 单独写换行
            bw.newLine();
            bw.flush();
            pw.println(line);
            pw.flush();
        }
        br.close();
        bw.close();
        pw.close();
    }
}
