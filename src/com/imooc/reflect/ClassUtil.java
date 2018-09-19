package com.imooc.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
    /**
     * 打印类的信息，成员函数、成员变量
     * @param obj
     */
    public static void printClassMessage(Object obj) {
        Class c = obj.getClass();
        System.out.println("Class Name = " + c.getName());
        Method[] ms = c.getMethods();
        for (int i = 0; i < ms.length; i++) {
            Class returnType = ms[i].getReturnType();
            System.out.print(returnType.getName() + " ");
            System.out.print(ms[i].getName() + "(");
            Class[] paramType = ms[i].getParameterTypes();
            for (Class class1 : paramType
            ) {
                System.out.print(class1.getName() + ",");
            }
            System.out.println(")");
        }
    }

    private static void printField(Object obj) {
        Class c = obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for (Field field: fs
             ) {
            Class fieldType = field.getType();
            String typeName = fieldType.getTypeName();
            String fieldName = field.getName();
            System.out.println(typeName + " " + fieldName);
        }
        try {
            Method m = c.getMethod("print", int.class, int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String s = "hello";
        ClassUtil.printClassMessage(s);
    }
}
