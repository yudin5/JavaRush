//package com.javarush.task.task09.task0905;

/*
Там, в синих глубинах стек-трейса…
Требования:
1. Метод getStackTraceDeep должен возвращать глубину своего стек-трейса.
2. Метод getStackTraceDeep должен выводить на экран глубину своего стек-трейса.
3. Воспользуйся методом Thread.currentThread().getStackTrace().
4. Метод main должен вызывать метод getStackTraceDeep.
*/

public class task0905 {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        int deepTrack = Thread.currentThread().getStackTrace().length;
        System.out.println(deepTrack);
        return deepTrack;
    }
}

