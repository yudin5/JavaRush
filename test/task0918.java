//package com.javarush.task.task09.task0918;

/*
Все свои, даже исключения
Требования:
1. В классе Solution должно быть 4 вложенных класса: MyException, MyException2, MyException3 и MyException4.
2. Все вложенные классы должны быть унаследованы от классов исключений.
3. Два класса из четырех должны быть checked исключениями.
4. Два класса из четырех должны быть unchecked исключениями.
*/

import java.io.FileNotFoundException;
import java.net.SocketException;

public class task0918 {
    public static void main(String[] args) {
    }

    static class MyException extends SocketException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends ArithmeticException{
    }

    static class MyException4 extends ArrayIndexOutOfBoundsException{
    }
}