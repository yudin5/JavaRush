package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        while(fileReader.ready()) {
            String line = fileReader.readLine();
            String result = line.replace(".", "!");
            fileWriter.write(result);
            fileWriter.write("\n");
        }
        fileReader.close();
        fileWriter.close();
    }
}
