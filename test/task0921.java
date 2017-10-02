//package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

/*
Метод в try..catch
Требования:
1. Программа должна считывать данные с клавиатуры.
2. Метод main не изменять.
3. Метод main не должен кидать исключений.
4. Метод readData должен содержать блок try..catch.
5. Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.
*/

public class task0921 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            while (true) {
                int number = 0; //очередное введённое пользователем число
                number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        }
        catch (NumberFormatException e) {
            for (int i : list) System.out.println(i);
        }
        catch (IOException e) {
            for (int i : list) System.out.println(i);
        }
    }
}
