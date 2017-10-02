package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) break;
            ReadThread nextThread = new ReadThread(fileName);
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static class ReadThread extends Thread {

        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {

            try {
                FileInputStream inputStream = new FileInputStream(fileName);

                //Карта с байтами и частотами их встречаемости
                HashMap<Integer, Integer> map = new HashMap<>();

                //Заполняем карту
                while(inputStream.available() > 0) {
                    int b = inputStream.read();
                    if (map.containsKey(b)) {
                        map.replace(b, map.get(b) + 1);
                    } else {
                        map.put(b, 1);
                    }
                }
                //Находим байт, встречающийся максимальное количество раз
                int neededByte = 0; //это сам байт
                int maxFreqOfB = 0; //это частота его встречаемости

                for (Map.Entry pair : map.entrySet()) {
                    if ((int) pair.getValue() > maxFreqOfB) {
                        maxFreqOfB = (int) pair.getValue();
                        neededByte = (int) pair.getKey();
                    }
                }

                //Добавляем найденный байт в resultMap
                synchronized (resultMap) {
                    resultMap.put(fileName, neededByte);
                }

                //Закрываем поток
                inputStream.close();
            } catch (IOException ex) { ex.printStackTrace(); }
        }
    }
}
