//package com.javarush.task.task09.task0906;

/*
Логирование стек трейса
Требования:
1. Метод log должен выводить сообщение на экран.
2. Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
3. Выведенное сообщение должно содержать имя метода, который вызвал метод log.
4. Выведенное сообщение должно содержать переданное сообщение.
5. Вывод должен соответствовать примеру из задания.
com.javarush.task.task09.task0906.Solution: main: In main method
*/

public class task0906 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        //получаем стек вызовов (это массив)
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        //получаем имя класса, в котором вызвали метод log. В массиве этот метод всегда идет под номером 2
        String className = stackTraceElements[2].getClassName();

        //получаем имя метода, который вызвал метод log
        String methodName = stackTraceElements[2].getMethodName();

        //выводим лог на экран
        System.out.println(className + ": " + methodName + ": " + s);
    }
}
