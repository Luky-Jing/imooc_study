package com.imooc.reflect;

public class ClassDemo1 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Class c1 = Foo.class;
        Class c2 = foo1.getClass();
        Class c3 = null;
        try {
            c3 = Class.forName("com.imooc.reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c3 == c2);
    }
}
class Foo {

}