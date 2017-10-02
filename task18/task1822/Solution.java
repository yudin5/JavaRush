package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) throw new IllegalArgumentException();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));

        String nextLine = fileReader.readLine();

        while (nextLine != null) {
            String[] lines = nextLine.split(" ");
            if (args[0].equals(lines[0])) {
                System.out.println(nextLine);
            }
            nextLine = fileReader.readLine();
        }

        reader.close();
        fileReader.close();

    }
}
