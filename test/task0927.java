//package com.javarush.task.task09.task0927;

import java.util.*;

/*
Десять котов
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен объявлять и инициализировать переменную типа HashMap.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class task0927 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> catsMap = new HashMap<String, Cat>();

        catsMap.put("Vaska", new Cat("Vaska"));
        catsMap.put("Barsik", new Cat("Barsik"));
        catsMap.put("Mashka", new Cat("Mashka"));
        catsMap.put("Frukt", new Cat("Frukt"));
        catsMap.put("Chubays", new Cat("Chubays"));
        catsMap.put("Ryzhik", new Cat("Ryzhik"));
        catsMap.put("Bratan", new Cat("Bratan"));
        catsMap.put("Timka", new Cat("Timka"));
        catsMap.put("Maylo", new Cat("Maylo"));
        catsMap.put("Pizhon", new Cat("Pizhon"));

        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        //создаем множество котов
        Set<Cat> catsSet = new HashSet<Cat>();
        //создаем множество пар "ключ-значение" из мапы
        Set<Map.Entry<String, Cat>> set = map.entrySet();
        //проходимся по этим парам и заносим всех котов по значению в созданный ранее catsSet
        for (Map.Entry<String, Cat> cat : set) {
            catsSet.add(cat.getValue());
        }
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
