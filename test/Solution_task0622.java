package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Числа по возрастанию
*/

public class Solution_task0622 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        //объявляем массив чисел
        int[] numbers = new int[5];

        //вводим числа и складываем их в массив
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
/*
        //ВАРИАНТ 1. И самый простой.
        //сортируем
        Arrays.sort(numbers);

        //выводим отсортированный массив
        for (int a : numbers) {
            System.out.println(a);
        }
*/

        //ВАРИАНТ 2. Самодеятельность
        //Начинаем перебирать все элементы массива
        for (int i = 0; i < numbers.length; i++) {
            //устанавливаем очередной элемент как минимальный
            int min = numbers[i];
            //перебираем оставшиеся числа и сравниваем их с min. Если число меньше, то меняем их местами.
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }

        //выводим отсортированный массив
        for (int a : numbers) {
            System.out.println(a);
        }

    }
}