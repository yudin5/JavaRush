//package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class task1013 {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private double height;
        private double weight;
        private Human mother;

        public Human (String name) { //1
            this.name = name;
        }

        public Human (int age) { //2
            this.age = age;
        }

        public Human (boolean sex) { //3
            this.sex = sex;
        }

        public Human (Human mother) { //4
            this.mother = mother;
        }

        public Human (double height, double weight) { //5
            this.height = height;
            this.weight = weight;
        }

        public Human (String name, int age) { //6
            this.name = name;
            this.age = age;
        }

        public Human (String name, int age, boolean sex) { //7
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human (String name, Human mother) { //8
            this.name = name;
            this.mother = mother;
        }

        public Human (Human mother, int age) { //9
            this.mother = mother;
            this.age = age;
        }

        public Human (double weight, double height, int age) { //10
            this.weight = weight;
            this.height = height;
            this.age = age;
        }
    }
}
