package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        //Потоки для чтения
        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        //Поток для записи
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);

        //Читаем из двух файлов
        byte[] file1 = new byte[fileInputStream1.available()];
        byte[] file2 = new byte[fileInputStream2.available()];

        int count1 = fileInputStream1.read(file1); //содержимое 1-го файла
        int count2 = fileInputStream2.read(file2); //содержимое 2-го файла

        //Пишем всё в 1-й файл. Сначала содержимое 2-го файла, потом 1-го.
        fileOutputStream.write(file2, 0, count2);
        fileOutputStream.write(file1, 0, count1);

        //Закрываем потоки
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();
    }
}
