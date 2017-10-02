package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        while(bufferedReader.ready()) {
            String[] parts = bufferedReader.readLine().split(" ");
            for (String el : parts) {
                if (el.matches("^\\d+")) {
                    bufferedWriter.write(el);
                    bufferedWriter.write(32);
                }
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
