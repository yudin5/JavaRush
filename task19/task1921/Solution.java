package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        if (args.length == 0) throw new IllegalArgumentException();
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);

        while(reader.ready()) {
            String[] parts = reader.readLine().split(" ");

            //Генерим дату
            int year = Integer.parseInt(parts[parts.length - 1]);
            int month = Integer.parseInt(parts[parts.length - 2]);
            int day = Integer.parseInt(parts[parts.length - 3]);

            String dateString = day + " " + month + " " + year;
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date birthday = format.parse(dateString);

            //Генерим имя
            String name = "";
            for (int i = 0; i < parts.length - 3; i++) {
                name = name + parts[i] + " ";
            }
            name = name.trim(); //обрезаем лишние пробелы

            //Заполняем список
            PEOPLE.add(new Person(name, birthday));
        }
        reader.close();
    }
}