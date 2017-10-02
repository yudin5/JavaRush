package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        PrintStream consoleOut = System.out;
        System.setOut(stream);
        //Вызываем метод
        testString.printSomething();
        //Возвращаем всё, как было
        System.setOut(consoleOut);

        byte[] array = outputStream.toString().getBytes();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int num = (int) array[i];
            char ch = (char) num;
            System.out.print(ch);
            if (ch == 10) {
                count++;
                if (count % 2 == 0) {
                    System.out.println("JavaRush - курсы Java онлайн");
                }
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
