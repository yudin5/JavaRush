package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(fileName1);
        FileInputStream inputStream1 = new FileInputStream(fileName2);
        FileInputStream inputStream2 = new FileInputStream(fileName3);

        //Очередь для чтения - сначала поток из 2-го файла, потом из 3-го
        SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream1, inputStream2);
        int readedByte = sequenceInputStream.read();
        while(readedByte != -1) {
            outputStream.write(readedByte); //записываем последовательно в 1-й файл
            readedByte = sequenceInputStream.read();
        }

        inputStream1.close();
        inputStream2.close();
        outputStream.close();

    }
}
