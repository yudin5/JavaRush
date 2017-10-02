package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(3,6,(Object) 'j');
        printMatrix("sdlfj", "sdlfkj", "sldfkj");
        printMatrix(3, "sdlfk", "sldkfj");
        printMatrix(4.6, 4, (Object) 56);
        printMatrix((Integer)3, (Integer) 4, "hello");
        printMatrix((short) 15, (short) 16, true);
        printMatrix(3.56);
        printMatrix('c');
        printMatrix(3,4,5);
    }
    //1
    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    //2
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    //3
    public static void printMatrix(String m, String n, String value) {
        System.out.println("ALL Strings!");
    }
    //4
    public static void printMatrix(int m, String n, String value) {
        System.out.println("M - int; N and Value - String");
    }
    //5
    public static void printMatrix(double m, int n, Object value) {
        System.out.println("M - double; N - int; Value - Object");
        printMatrix(m, n, value);
    }

    //6
    public static void printMatrix(Integer m, Integer n, String value) {
        System.out.println("M - Integer; N - Integer; Value - String");
        printMatrix(m, n, (Object) value);
    }

    //7
    public static void printMatrix(short m, short n, boolean value) {
        System.out.println("M - short; N - short; Value - boolean");
        printMatrix(m, n, value);
    }


    //10
    public static void printMatrix(double m) {
        System.out.println("Only M. Only double.");
    }

    //8
    public static void printMatrix(char ch) {
        System.out.println("Only ch - char");
    }

    //9
    public static void printMatrix(int m, int n, int value) {
        System.out.println("ALL - int");
        System.out.println("Hello!");
    }




}
