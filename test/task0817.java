//package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Нам повторы не нужны
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class task0817 {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Ивано", "Алексей");
        map.put("Иван", "Петр");
        map.put("Ива", "Степан");
        map.put("Петров", "Ираклий");
        map.put("Петро", "Андрей");
        map.put("Петр", "Владимир");
        map.put("Сидоров", "Андрей");
        map.put("Кузнецов", "Алексей");
        map.put("Стулов", "Андрей");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        Set<String> names = new HashSet<String>(); //список всех имен
        Set<String> duplicate = new HashSet<String>(); //список повторяющихся имен

        for (Map.Entry<String, String> pair : map.entrySet()) { //проходим по всем парам из map
            String name = pair.getValue(); //извлекаем имя
            if (names.contains(name)) { //если имя содержится в списке имен, то добавляем его в дубликаты
                duplicate.add(name);
            }
            else {
                names.add(name); //если не содержится, то добавляем его в список имен
            }
        }

        //теперь проходим по списку дубликатов и вызываем для каждого имени метод removeItemFromMapByValue
        for (String s : duplicate) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println();

        HashMap<String, String> smap = createMap();
        removeTheFirstNameDuplicates(smap);
        System.out.println(smap);
    }
}
