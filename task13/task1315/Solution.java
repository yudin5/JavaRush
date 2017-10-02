package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public static class Cat implements Movable, Eatable, Eat {

        @Override
        public void move() {
            System.out.println("Cat is moving!");
        }

        @Override
        public void eaten() {
            System.out.println("Cat has been eaten!");
        }

        @Override
        public void eat() {
            System.out.println("Cat has ate somebody!");
        }
    }

    public static class Mouse implements Movable, Eatable {

        @Override
        public void eaten() {
            System.out.println("Mouse has been eaten!");
        }

        @Override
        public void move() {
            System.out.println("Mouse is moving!");
        }

    }

    public static class Dog implements Movable, Eat {

        @Override
        public void move() {
            System.out.println("Dog is moving!");
        }

        @Override
        public void eat() {
            System.out.println("Dog has ate somebody!");
        }
    }

}