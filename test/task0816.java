//package com.javarush.task.task08.task0816;

import java.util.*;

/*
Добрая Зинаида и летние каникулы
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class task0816 {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Scharz", new Date("JULY 1 1980"));
        map.put("Madonna", new Date("AUGUST 1 1980"));
        map.put("Dolf", new Date("SEPTEMBER 1 1980"));
        map.put("Jan Cloude", new Date("APRIL 1 1980"));
        map.put("Bruce Lee", new Date("JUNE 1 1980"));
        map.put("Kostner", new Date("JUNE 1 1980"));
        map.put("Uillis", new Date("OCTOBER 1 1980"));
        map.put("Carter", new Date("DECEMBER 1 1980"));
        map.put("Eltsin", new Date("JANUARY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator it = map.entrySet().iterator();
        for (; it.hasNext(); ) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            Date d = (Date) pair.getValue();
            if (d.getMonth() > 4 && d.getMonth() < 8)
                it.remove();
        }
    }
/*
        for (Map.Entry<String, Date> man : set) {
            if ((man.getValue().getMonth() == 5)||(man.getValue().getMonth() == 6)||(man.getValue().getMonth() == 7))
                map.remove(man.getKey());
        }
*/

    public static void main(String[] args) {
        HashMap<String, Date> smap = createMap();
        removeAllSummerPeople(smap);
        System.out.println(smap);
    }
}
