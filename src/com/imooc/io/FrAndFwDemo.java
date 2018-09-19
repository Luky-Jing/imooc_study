package com.imooc.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FrAndFwDemo {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\file.txt");
        FileWriter fw = new FileWriter("D:\\Office\\IdeaProjects\\imooc_study\\src\\com\\imooc\\io\\test.txt");

        char[] buffer = new char[256];
        int c;
        while ((c = fr.read(buffer, 0, buffer.length)) != -1) {
            fw.write(buffer, 0, c);
            fw.flush();
        }

        fw.close();
        fr.close();
    }
}
