package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String stringToParse = fileScanner.nextLine();
            String[] personData = stringToParse.split(" ");
            String birth = String.format("%s %s %s", personData[3], personData[4], personData[5]);
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = null;
            try {
                birthDate = format.parse(birth);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            Person person = new Person(personData[1], personData[2], personData[0], birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
