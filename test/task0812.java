//package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/*
Cамая длинная последовательность
Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class task0812 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //заполняем список значениями с клавиатуры
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        //создаем список, который будет хранить количество повторений. Обойдемся!
        //ArrayList<Integer> listRep = new ArrayList<Integer>();

        //number - это очередное число из списка. Для начала берём первое.
        int number = list.get(0);
        //count - счетчик повторов
        int count = 1;
        //max - максимальное количество повторов
        int max = count;

        //проходим по списку и сравниваем, совпадает ли следующее число с текущим number. Если совпадает, то увеличиваем счетчик на 1.
        //Если не совпадает, то присваиваем значению number новое число, счетчик ставим на 1. Сравниваем count с max.
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i+1)) {
                count++;
                if (count > max) max = count;
            }
            else {
                count = 1;
            }
        }

        System.out.println(max);
/*
        //на случай, если все числа в списке одинаковые
        listRep.add(count);

        //проходим по списку listRep и выводим максимальное значение
        int max = listRep.get(0);
        for (int i = 1; i < listRep.size(); i++) {
            if (listRep.get(i) > max)
                max = listRep.get(i);
        }

        //выводим max - длина самой длинной повторяющейся последовательности
        System.out.println(max);
*/
    }
}