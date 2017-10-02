//package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
Требования:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.
*/

public class task0713 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> glav = new ArrayList<Integer>(); //все числа
        ArrayList<Integer> dop3 = new ArrayList<Integer>(); //все, которые делятся на 3
        ArrayList<Integer> dop2 = new ArrayList<Integer>(); //все, которые делятся на 2
        ArrayList<Integer> dopOst = new ArrayList<Integer>(); //оставшиеся - те, которые не делятся на 2 и на 3

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //вводим числа и сразу распихиваем их по массивам
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            glav.add(number);

            if (number%3 == 0)
                dop3.add(number);
            if (number%2 == 0)
                dop2.add(number);
            if (!(number%2 == 0) && !(number%3 == 0))
                dopOst.add(number);
        }

        printList(dop3);
        printList(dop2);
        printList(dopOst);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i : list) {
            System.out.println(list.get(i));
        }
    }
}