package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine(); //ввод пользователя
            if (str.equals("helicopter")) { //создаем вертолет
                result = new Helicopter();
            }
            else if (str.equals("plane")) { //создаем самолет
                int passNumber = Integer.parseInt(reader.readLine()); //число пассажиров
                result = new Plane(passNumber);
            } //или вообще ничего не создаем
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
