package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        //Читаем имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        //Подменяем System.out
        PrintStream consoleOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream ourStream = new PrintStream(outputStream);
        System.setOut(ourStream);
        //Вызываем метод
        testString.printSomething();
        //Меняем всё, как было
        System.setOut(consoleOut);
        //Пишем в файл
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        byte[] result = outputStream.toByteArray();
        fileOutputStream.write(result);
        fileOutputStream.close();
        System.out.println(outputStream.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

