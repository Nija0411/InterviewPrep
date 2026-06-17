package com.testing.practice.test01_java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Test t1 = new Test();
        int result = t1.calculator(30, 10);
        System.out.println(result);

        //Accessing private members using Reflection/class reference
        Class<?> clazz = Test.class;
        Field x = clazz.getDeclaredField("x");
        x.setAccessible(true);
        System.out.println(x.get(t1));


        //Accessing method
        Method method = clazz.getMethod("calculator", int.class, int.class);
        int result1 = (int) method.invoke(t1, 10, 40);
        System.out.println(result1);
    }
}
