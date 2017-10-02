package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if (args.length > 0) {
            switch (args[0]) {
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDay(null);
                        }
                    }
                    break;

                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            //Очередной человек
                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            //Выводим имя (фамилию)
                            System.out.print(person.getName() + " ");
                            //Выводим пол
                            if (person.getSex() == Sex.MALE) {
                                System.out.print("м ");
                            } else {
                                System.out.print("ж ");
                            }
                            //Выводим дату рождения
                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            System.out.println(dateFormat.format(person.getBirthDay()));
                        }
                    }
                break;

                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i+=3) {
                            //Формируем дату рождения
                            SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                            Date birth = null;
                            //Дата рождения - это args[i+2]
                            try {
                                birth = fd.parse(args[i+2]);
                            } catch (ParseException ex) { ex.printStackTrace(); }
                            //Пол - это args[i+1], Имя - это args[i]
                            if (args[i+1].equals("м")) {
                                allPeople.add(Person.createMale(args[i], birth));
                            } else {
                                allPeople.add(Person.createFemale(args[i], birth));
                            }
                            //Выводим id
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                break;

                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i+=4) {
                            //Очередной челове. id = args[i]
                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            //Имя - это всегда args[i+1]
                            person.setName(args[i+1]);
                            //Пол - это args[i+2}
                            Sex sex = (args[i+2].equals("м")) ? Sex.MALE : Sex.FEMALE;
                            person.setSex(sex);
                            //Дата рождения - это args[i+3]
                            try {
                                person.setBirthDay(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+3]));
                            } catch (ParseException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }


            }
        }
    }
}
