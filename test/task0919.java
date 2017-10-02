//package com.javarush.task.task09.task0919;

/*
Деление на ноль
Требования:
1. Метод divisionByZero должен содержать операцию деления любого числа на ноль.
2. Метод divisionByZero должен вызывать System.out.println или System.out.print.
3. Метод main должен содержать блок try..catch.
4. Метод main должен отлавливать исключения метода divisionByZero.
5. Программа должна выводить стек-трейс пойманого исключения.
*/

public class task0919 {

    public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero(){
        int a = 8/0;
        System.out.println(a);
    }
}
