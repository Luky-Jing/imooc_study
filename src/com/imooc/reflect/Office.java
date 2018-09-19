package com.imooc.reflect;

public class Office {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            OfficeAble officeAble = (OfficeAble) c.newInstance();
            officeAble.start();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
