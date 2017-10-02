//package com.javarush.task.task08.task0827;

import java.util.Date;

/*
Работа с датой
Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class task0827 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date) {
        //преобразовываем в дату - переменная current
        Date current = new Date(date);

        //устанавливаем на начало года
        Date yearStartTime = new Date(current.getYear(), 0,1);

        long msTimeDistance = current.getTime() - yearStartTime.getTime(); //разница в миллисекундах
        long msDay = 24 * 60 * 60 * 1000; //кол-во миллисекунд в одних сутках
        long dayCount = msTimeDistance/msDay + 1; //кол-во целых дней с начала года

        return !(dayCount%2 == 0);
    }
}