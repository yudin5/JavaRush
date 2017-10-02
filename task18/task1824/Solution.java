package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    //static boolean isExit = false;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String fileName = reader.readLine();
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(fileName);
                inputStream.close();
            } catch (FileNotFoundException ex) {
                System.out.println(fileName);
                reader.close();
                break;
            }
        }
    }
}
