package com.imooc.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

    public static void main(String[] args) throws IOException {
        String file = "demo/dos.dat";
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

        dos.writeInt(10);
        dos.writeInt(-10);
        dos.writeDouble(4.5);
        dos.writeUTF("中文");
        dos.close();
        IOUtil.printHex(file);
    }
}
