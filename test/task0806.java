//package com.javarush.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/*
Коллекция HashMap из Object
Требования:
1. Программа должна создавать переменную коллекции HashMap с типом элементов String, Object. Переменная должна быть сразу проинициализирована.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 различных объектов, согласно условию.
4. Программа должна выводить на экран список значений коллекции, каждый элемент с новой строки.
*/

public class task0806 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
