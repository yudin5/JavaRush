package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        TreeMap<Integer, String> map = new TreeMap<>();
        //String regex = "\\.part\\d+?$";
        while (!"end".equals(fileName = reader.readLine())) {
            //if (fileName.matches("(.+)" + regex) && new File(fileName).exists()) {
                int part = Integer.parseInt(fileName.split("part")[1]);
                map.put(part, fileName);
        }
        reader.close();

        //Получаем абсолютный путь для папки, в которой будет финальный файл
        File file = new File(map.get(1));
        String path = file.getAbsolutePath();
        String newpath = path.substring(0, path.lastIndexOf("."));

        //Создаем финальный файл
        File result = new File(newpath);

        FileInputStream fis;
        FileOutputStream fos = new FileOutputStream(result);
        for (String s : map.values()) {
            fis = new FileInputStream(s);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            fos.write(buffer);
        }
        fos.close();
    }
}