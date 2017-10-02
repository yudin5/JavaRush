//package com.javarush.task.task07.task0724;
import java.util.ArrayList;
/*
Семейная перепись
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class task0724 {
    public static void main(String[] args) {
        //напишите тут ваш код
        //создаем дедов
        Human otecOtca = new Human("Василий Петрович", true, 70);
        Human otecMateri = new Human("Иван Дмитриевич", true, 68);
        //создаем бабушек
        Human matOtca = new Human("Марфа Никифоровна", false, 69);
        Human matMateri = new Human("Варвара Семёновна", false, 67);
        //создаем отца и мать
        Human otec = new Human("Ираклий Васильевич", true, 40, otecOtca, matOtca);
        Human mat = new Human("Наталья Ивановна", false, 39, otecMateri, matMateri);
        //создаем 3-х детей
        Human syn1 = new Human("Петя", true, 17, otec, mat);
        Human syn2 = new Human ("Андрей", true, 19, otec, mat);
        Human dochb = new Human("Эмма", false, 16, otec, mat);
        //объявляем список для этих людей
        ArrayList<Human> list = new ArrayList<Human>();
        //добавляем их всех в список
        list.add(otecOtca);
        list.add(otecMateri);
        list.add(matOtca);
        list.add(matMateri);
        list.add(otec);
        list.add(mat);
        list.add(syn1);
        list.add(syn2);
        list.add(dochb);

        //выводим их всех на экран
        for (Human h : list) System.out.println(h);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
