package org.nerdware;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("Fluffy", 3);
        Field[] fields = cat.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        for ( Field field: fields ){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(cat, "Mr. Fluffy");
            }
        }
        Method[] methods = cat.getClass().getDeclaredMethods();
        for (Method method : methods){
            if (method.getName().equals("getName")){
                method.setAccessible(true);
                System.out.println(method.invoke(cat));
            }
        }
    }
}