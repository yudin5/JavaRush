package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //динамически растягиваемый массив
        PrintStream stream = new PrintStream(outputStream); //создали адаптер к классу PrintStream
        System.setOut(stream); //установили его как текущий System.out

        //Вызываем метод. В итоге текст из метода НЕ выводится на экран, а записывается в наш ByteArrayOutputStream
        testString.printSomething();

        //Возвращаем как было
        System.setOut(consoleStream);

        //Меняем строку согласно заданию и выводим результат
        String result = outputStream.toString(); //извлекаем из нашего массива строку
        result = result.toUpperCase();
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
