//package com.javarush.task.task08.task0824;

/*
Собираем семейство
Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class task0824 {
    public static void main(String[] args) {
        //напишите тут ваш код
        //создаем внуков
        Human syn1 = new Human("Вася", true, 15, null);
        Human syn2 = new Human("Валера", true, 16, null);
        Human docha = new Human("Мальвина", false, 17, null);

        //списки детей для мамы и папы
        ArrayList<Human> deti = new ArrayList<Human>();
        deti.add(syn1);
        deti.add(syn2);
        deti.add(docha);

        //создаем маму и папу
        Human mama = new Human("Маруся", false, 35, deti);
        Human papa = new Human("Паша", true, 36, deti);

        //списки детей для дедушек и бабушек
        ArrayList<Human> detiDedAndBabM = new ArrayList<Human>();
        detiDedAndBabM.add(mama);
        ArrayList<Human> detiDedAndBabP = new ArrayList<Human>();
        detiDedAndBabP.add(papa);

        //создаем бабушек и дедушек
        Human dedushkaM = new Human("Дедушка Миша", true, 75, detiDedAndBabM);
        Human dedushkaP = new Human("Дедушка Петя", true, 78, detiDedAndBabP);
        Human babushkaM = new Human("Бабушка Маша", false, 74, detiDedAndBabM);
        Human babushkaP = new Human("Бабушка Параша", false, 77, detiDedAndBabP);

        //выводим на экран всех
        List<Human> family = Arrays.asList(syn1, syn2, docha, mama, papa, dedushkaM, dedushkaP, babushkaM, babushkaP);
        for (Human h : family) {
            System.out.println(h);
        }
      }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children != null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }
}
