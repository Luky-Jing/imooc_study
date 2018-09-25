package com.imooc.io;

import java.io.*;

public class ObjectSeriaDemo1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "demo/obj.dat";
//        ObjectOutputStream oos = new ObjectOutputStream(
//                new FileOutputStream(file)
//        );
//        Student stu = new Student("1001", "zhangsan", 20);
//        oos.writeObject(stu);
//        oos.flush();
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(file)
        );
        Student stu = (Student)ois.readObject();
        System.out.println(stu);
        ois.close();


    }
}
