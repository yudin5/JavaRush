//package com.javarush.task.task09.task0925;

/*
Статики не на своем месте
*/

public class task0925 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        task0925 room = new task0925();
        room.A = 5;

        task0925.D = 5;
    }

    public int getA() {
        return A;
    }

}
