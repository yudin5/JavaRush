package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0 || args.length == 1) throw new IllegalArgumentException();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        //BufferedReader reader = new BufferedReader(new FileReader("C:/data.txt"));
        //BufferedWriter writer = new BufferedWriter(new FileWriter("C:/result.txt"));

        String finalResult = "";
        while (reader.ready()) {
            String line = reader.readLine();
            String[] parts = line.split(" ");
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].length() > 6) finalResult = finalResult + parts[i] + ",";
                }
        }
        finalResult = finalResult.substring(0, finalResult.length() - 1);
        writer.write(finalResult);

        reader.close();
        writer.close();
    }
}
