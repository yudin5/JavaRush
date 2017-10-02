package com.javarush.task.Test;


import java.io.*;

/**
 * Created by Tigrenok on 08.09.2017.
 * Запись сразу в файл при помощи PrintLn-а
 */
public class WriteToFileWithPrinlnTest {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

    //Читаем имя файла
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String fileName = reader.readLine();
    reader.close();
    //Подменяем System.out
    PrintStream consoleOut = System.out;
    FileOutputStream outputStream = new FileOutputStream(fileName);
    PrintStream ourStream = new PrintStream(outputStream);
    System.setOut(ourStream);
    //Вызываем метод
        testString.printSomething();
        System.out.println("Куку, привет.");
        System.out.println("aaa bbb ccc 12345");
        System.out.println("А вот это напечатаешь?");
    //Меняем всё, как было
        System.setOut(consoleOut);
}

public static class TestString {
    public void printSomething() {
        System.out.println("it's a text for testing");
    }
}
}
