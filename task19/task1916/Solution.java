package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileReader fr1 = new FileReader(fileName1);
        FileReader fr2 = new FileReader(fileName2);
        BufferedReader fileReader1 = new BufferedReader(fr1);
        BufferedReader fileReader2 = new BufferedReader(fr2);
        ArrayList<String> original = new ArrayList<>();
        ArrayList<String> revised = new ArrayList<>();

        //Формируем список из строк из первого файла (оригинал)
        while (fileReader1.ready()) {
            String lineFile1 = fileReader1.readLine();
            original.add(lineFile1);
        }
        //Формируем список из строк из второго файла (ревидированный)
        while (fileReader2.ready()) {
            String lineFile2 = fileReader2.readLine();
            revised.add(lineFile2);
        }

        fileReader1.close();
        fileReader2.close();

        int i = 0; //счетчик для первого списка
        int j = 0; //счетчик для второго списка
        while (i < original.size() && j < revised.size()) {
            if (original.get(i).equals(revised.get(j))) {
                lines.add(new LineItem(Type.SAME, original.get(i)));
                i++;
                j++;
            } else if (original.get(i + 1).equals(revised.get(j)) && !original.get(i).equals(revised.get(j+1))) {
                lines.add(new LineItem(Type.REMOVED, original.get(i)));
                i++;
            } else {
                lines.add(new LineItem(Type.ADDED, revised.get(j)));
                j++;
            }
        }
        if (original.size() > revised.size()) lines.add(new LineItem(Type.REMOVED, original.get(i)));
        if (original.size() < revised.size()) lines.add(new LineItem(Type.ADDED, revised.get(j)));


        for (LineItem item : lines) {
            System.out.println(item.type + " " + item.line);
        }



    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
