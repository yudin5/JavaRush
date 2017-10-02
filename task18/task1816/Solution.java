package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        try {
            while(inputStream.available() > 0) {
                int symbol = inputStream.read();
                if ((symbol > 64 && symbol < 91) || (symbol > 96 && symbol < 123)) count++;
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        inputStream.close();
        System.out.println(count);
    }
}
