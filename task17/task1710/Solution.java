package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Ivanov", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Petrov", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if (args.length > 0) {
            if (args[0].equals("-c")) {
                SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date birth = null;
                try {
                    birth = fd.parse(args[3]);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], birth));
                } else {
                    allPeople.add(Person.createFemale(args[1], birth));
                }
                System.out.println(allPeople.size() - 1);
            }

            if (args[0].equals("-u")) {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                Sex sex = (args[3].equals("м")) ? Sex.MALE : Sex.FEMALE;
                person.setSex(sex);
                try {
                    person.setBirthDay(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            }

            if (args[0].equals("-d")) {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDay(null);
                //allPeople.remove(Integer.parseInt(args[1]));
            }

            if (args[0].equals("-i")) {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                //Выводим имя (фамилию)
                System.out.print(person.getName() + " ");
                //Выводим пол
                if (person.getSex() == Sex.MALE) {
                    System.out.print("м ");
                } else {
                    System.out.println("ж ");
                }
                //Выводим дату рождения
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(dateFormat.format(person.getBirthDay()));
                //System.out.print(person.getBirthDay());
            }
        }
    }
}
