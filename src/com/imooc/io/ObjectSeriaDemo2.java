package com.imooc.io;

import java.io.*;

public class ObjectSeriaDemo2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(
//                new FileOutputStream("demo/obj1.dat")
//        );
//        Foo2 foo2 = new Foo2();
//        oos.writeObject(foo2);
//        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("demo/obj1.dat")
        );
        Foo2 foo2 = (Foo2) ois.readObject();
        System.out.println(foo2);

        /**
         * 对子类对象进行反序列化操作是，
         * 如果其父类的构造函数被调用
         */
    }
}

/**
 * 一个类实现了序列化接口，其子类都可以直接序列化
 */
class Foo implements Serializable {
    public Foo() {
        System.out.println("foo...");
    }
}

class Foo1 extends Foo {
    public Foo1() {
        System.out.println("foo1...");
    }
}

class Foo2 extends Foo {
    public Foo2() {
        System.out.println("foo2...");
    }
}
class Bar {
    public Bar() {

    }
}
class Bar1 extends Bar {
    public Bar1() {

    }
}