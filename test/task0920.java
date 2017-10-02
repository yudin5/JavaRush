//package com.javarush.task.task09.task0920;

/*
Обратный отсчёт
Требования:
1. Программа должна выводить отсчет от 10 до 0.
2. Программа должна выводить на экран новое число каждые 100 миллисекунд.
3. Программа должна использовать метод "Thread.sleep(100);".
4. Метод main должен содержать блок try..catch.
5. Метод main не должен кидать исключений.
*/

public class task0920 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
                System.out.println("Ой, что-то пошло не так!");
            }
        }
    }
}
