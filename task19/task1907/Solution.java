package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);

        int count = 0; //счетчик слов "world"
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while(bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] parts = line.split("[\\p{Punct}\\s]+");
            for (String el : parts) {
                if (el.equals("world")) count++;
            }
            //while(Pattern.compile("[\\W]world[\\W]").matcher(line).find())count++;
        }
        bufferedReader.close();
        //fileReader.close();
        System.out.println(count);
    }
}
