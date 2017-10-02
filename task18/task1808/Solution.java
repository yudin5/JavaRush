package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName3);

        //Получаем все данные из 1-го файла в виде массива
        if (fileInputStream.available() > 0) {
            byte[] buffer = new byte[fileInputStream.available()];

            int count = fileInputStream.read(buffer); //размер буфера, то есть содержимого всего файла для чтения

            if (buffer.length % 2 == 0) { //если четное число байт
                fileOutputStream1.write(buffer, 0, count/2);
                fileOutputStream2.write(buffer, count/2, count/2);
            } else {
                fileOutputStream1.write(buffer, 0, count/2+1);
                fileOutputStream2.write(buffer, count/2+1, count/2);
            }
        }

        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();

    }
}
