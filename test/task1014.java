//package com.javarush.task.task10.task1014;

/*
Расставьте минимум static-ов
Требования:
1. В классе должна быть переменная A.
2. В классе должна быть переменная B.
3. В классе должна быть переменная C.
4. В классе должна быть переменная D.
5. Метод main не изменять.
6. Метод getA не изменять.
*/

public class task1014 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        task1014 solution = new task1014();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        task1014.D = 5 * D * C;

        task1014.D = 5;
    }

    public int getA() {
        return A;
    }

}
