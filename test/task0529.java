package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Tigrenok on 03.07.2017.
 */

public class task0529 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        boolean isExit = false; //условие выхода
        int sum = 0; //сумма чисел
        int number; //очередное число
        String sNumber;

        while (!isExit) { //принимаем числа, пока пользователь не введет "сумма"
            sNumber = bufferedReader.readLine();

            if (sNumber.equals("сумма")) { //со строкой ТОЛЬКО EQUALS
                System.out.println(sum); //выводим итоговую сумму
                isExit = true; //выходим из цикла while
            } else {
                number = Integer.parseInt(sNumber);
                sum += number;
            }
        }
    }
}
