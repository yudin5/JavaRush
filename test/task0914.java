//package com.javarush.task.task09.task0914;

/*
Группа перехвата исключений
Требования:
1. Метод main должен вызывать метод method1.
2. Метод main должен перехватывать исключение Exception1.
3. Метод main должен перехватывать исключение Exception2.
4. Метод main должен перехватывать исключение Exception3.
5. Метод method1 не изменять.
*/

public class task0914 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        }
        catch (Exception3 e) {
            System.out.println(e);
        }
        catch (Exception2 e) {
            System.out.println(e);
        }
        catch (Exception1 e) {
            System.out.println(e);
        }
        //напишите тут ваш код

    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
