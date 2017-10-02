package com.javarush.task.task14.task1419;


import java.io.File;
import java.io.FileReader;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception

        //1 - java.lang.ArithmeticException: / by zero
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        //2 -java.lang.ArrayIndexOutOfBoundsException: 4
        try {
            int[] a = new int[3];
            a[4] = 5;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //3 - java.lang.NumberFormatException: For input string: "one"
        try {
            int i = Integer.parseInt("one");
        } catch (Exception e) {
            exceptions.add(e);
        }

        //4 - java.lang.NullPointerException
        try {
            Object i = new Integer(3);
            i = null;
            i.hashCode();
        } catch (Exception e) {
            exceptions.add(e);
        }

        //5 - java.io.FileNotFoundException: C:\sdkj.txt (Не удается найти указанный файл)
        try {
            File f = new File("C:/sdkj.txt");
            FileReader fr = new FileReader(f);
        } catch (Exception e) {
            exceptions.add(e);
        }

        //6 - java.lang.ArrayStoreException: java.lang.Integer
        try {
            Object[] array = new String[10];
            array[0] = new Integer(3);
        } catch (Exception e) {
            exceptions.add(e);
        }

        //7 - java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Byte
        try {
            Object obj = new String("str");
            System.out.println((byte) obj);
        } catch (Exception e) {
            exceptions.add(e);
        }

        //8 - java.lang.NegativeArraySizeException
        try {
            int[] array = new int[-5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        //9 - java.lang.StringIndexOutOfBoundsException: String index out of range: 5
        try {
            String str = "abc";
            char ch = str.charAt(5);
        } catch (Exception e) {
            exceptions.add(e);
        }

        //10 - java.lang.IllegalArgumentException
        try {
            Date.parse("sdlfkj");
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}

