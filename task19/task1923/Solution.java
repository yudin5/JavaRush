package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0 || args.length == 1) throw new IllegalArgumentException();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        //BufferedReader reader = new BufferedReader(new FileReader("C:/data.txt"));
        //BufferedWriter writer = new BufferedWriter(new FileWriter("C:/result.txt"));


        while (reader.ready()) {
            String line = reader.readLine();
            String[] parts = line.split(" ");
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].matches(".*\\d+.*")) {
                    writer.write(parts[i]);
                    writer.write(32);
                    //writer.newLine();
                }
            }
        }
        reader.close();
        writer.close();
    }
}
