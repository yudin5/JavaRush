package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int data;

        //Создаем множество. TreeSet не содержит повторов и хранит данные в отсортированном порядке. Имба!
        TreeSet<Integer> treeSet = new TreeSet<>();

        while(fileInputStream.available() > 0) {
            data = fileInputStream.read();
            treeSet.add(data); //TreeSet добавляет элемент, только если его нет во множестве
        }

        for (int i : treeSet) {
            System.out.print(i + " ");
        }

        fileInputStream.close();

    }
}
