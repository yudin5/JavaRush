package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        String file1String = readerConsole.readLine();
        String file2String = readerConsole.readLine();

        File file1 = new File(file1String);
        File file2 = new File(file2String);

        BufferedReader readerFile1 = new BufferedReader(new FileReader(file1));
        BufferedReader readerFile2 = new BufferedReader(new FileReader(file2));

        //Считываем из 1-го файла
        String line;
        while ((line = readerFile1.readLine()) != null) {
            allLines.add(line);
        }

        //Считываем из 2-го файла
        while ((line = readerFile2.readLine()) != null) {
            forRemoveLines.add(line);
        }

        Solution test = new Solution();
        try {
            test.joinData();
        } catch (CorruptedDataException ex) {
            ex.printStackTrace();
        } finally {
            readerConsole.close();
            readerFile1.close();
            readerFile2.close();
        }

    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
