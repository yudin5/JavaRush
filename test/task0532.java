package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Tigrenok on 03.07.2017.
 */

public class task0532 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine()); //вводим N - количество чисел
        int number = 0; //очередное число

        for (int i = 0; i < N; i++) {
            number = Integer.parseInt(reader.readLine()); //считываем число
            maximum = (number > maximum) ? number : maximum; //если очередное число больше, чем maximum, то оно становится maximum
        }

        System.out.println(maximum);
    }
}
