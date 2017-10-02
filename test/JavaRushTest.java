package test;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Tigrenok on 25.05.2017.
 */
public class JavaRushTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        /**System.out.println("Hello JavaRush!");

        //Выводим число 850, расставляя правильно скобки
        System.out.println((1 + 2) * (3 + 4) * 5 + (6 * 7 + 8) * 9 + 10 * 11 + 12 * 13 + 14 + 15);

        //Выводим суммы чисел от 1 до 10 в новой строке
        int sum = 0;
        for (int i = 1; i < 11; i++)
        {
            sum += i;
            System.out.println(sum);
        }

        //Выводим таблицу умножения
        for (int i = 1; i < 11; i++)
        {
            for (int j = 1; j < 11; j++)
            {
                System.out.print(" " + i*j);
            }
            System.out.println("");
        }

        //Экранирование символов
        //It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");

        //It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

        //Вывод японских иероглифов
        char a = '\u4771';
        System.out.println(a);
        System.out.println("日本語");

        //Ввод строки и числа с клавиатуры
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        //String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        //int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        //System.out.println(nAge);

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);

    }
    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = this.age + 20;
            System.out.println("The Age in adjustAge() is " + this.age);
        }
    }

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String day = bufferedReader.readLine();
        int iDay = Integer.parseInt(day);

        if ((iDay > 7) || (iDay < 1)) System.out.println("такого дня недели не существует");
        if (iDay == 1) System.out.println("понедельник");
        if (iDay == 2) System.out.println("вторник");
        if (iDay == 3) System.out.println("среда");
        if (iDay == 4) System.out.println("четверг");
        if (iDay == 5) System.out.println("пятница");
        if (iDay == 6) System.out.println("суббота");
        if (iDay == 7) System.out.println("воскресенье");

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sA = bufferedReader.readLine();
        String sB = bufferedReader.readLine();
        String sC = bufferedReader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if (a >= (b+c)) System.out.println("Треугольник не существует.");
        else if (b >= (a+c)) System.out.println("Треугольник не существует.");
        else if (c >= (a+b)) System.out.println("Треугольник не существует.");
        else System.out.println("Треугольник существует.");

        //Светофор. com.javarush.task.task04.task0416;
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String t = bufferedReader.readLine();
        double minute = Double.parseDouble(t);

        double position = minute%5; //вычисляем позицию в цикле, чтобы определить цвет

        if ((position >= 0) && (position < 3)) System.out.println("зелёный");
        if ((position >= 3) && (position < 4)) System.out.println("желтый");
        if ((position >= 4) && (position < 5)) System.out.println("красный");

        //Исправлял чьё-то решение внизу. Та же задача про светофор.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());

        double count=0;


        while (true) {
            if (time >= count && time < count + 3) {
                System.out.println("зелёный");
                break;
            }
            if (time >= count + 3 && time < count + 4) {
                System.out.println("желтый");
                break;
            }
            if (time >= count + 4 && time < count + 5) {
                System.out.println("красный");
                break;
            }
            count=count+5;
        }

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sA = bufferedReader.readLine();
        String sB = bufferedReader.readLine();
        String sC = bufferedReader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if ((a == b) && (b == c)) System.out.println(a + " " + b + " " + c);
        else if (a == b) System.out.println(a + " " + b);
        else if (a == c) System.out.println(a + " " + c);
        else if (b == c) System.out.println(b + " " + c);

        //максимум 4-х чисел    .....com.javarush.task.task04.task0419;
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sA = bufferedReader.readLine();
        String sB = bufferedReader.readLine();
        String sC = bufferedReader.readLine();
        String sD = bufferedReader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int d = Integer.parseInt(sD);

        if (max(a, b) > max(c, d))
        System.out.println(max(a, b));
        else
        System.out.println(max(c, d));

    }

    public static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int aa = 1, bb = 2, cc = 3;

        if (a != b & b != c & a != c);
        else if (a != b & a != c) System.out.print(aa);
        else if (b != a & b != c) System.out.print(bb);
        else if (c != a & c != b) System.out.print(cc);

        Cat cat1 = new Cat("Vaska");
        Cat cat2 = new Cat("Vaska");
        System.out.println(cat1.equals(cat2)); //выведет false
    }
        public static class Cat {
            String name;
            Cat(String name) {
                this.name = name;
            }
        }


        //package com.javarush.task.task04.task0442;
        boolean isExit = false; //условие выхода
        int sum = 0; //сумма чисел
        int number = 0; //очередное число

        while (!isExit) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(bufferedReader.readLine());
            sum += number;

            if (number == -1) {
                System.out.println(sum); //выводим итоговую сумму
                isExit = true; //выходим из цикла while
            }
        }

        //package com.javarush.task.task04.task0443;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int y = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

//package com.javarush.task.task05.task0507; Среднее арифметическое
        boolean isExit = false; //условие выхода
        double sum = 0; //сумма чисел
        int number = 0; //очередное число
        int i = 0; //счетчик чисел

        while (!isExit) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(bufferedReader.readLine());

            if (number == -1) {
                System.out.println(sum/i); //выводим итоговое среднее
                isExit = true; //выходим из цикла while
            }

            sum += number; //суммируем введенные числа
            i++; //увеличиваем счетчик чисел на 1 и вводим следующее число
        }

        //package com.javarush.task.task05.task0528;
        Date today = new Date();
        System.out.printf("%td %<tm %<tY", today); //вывод в формате "ДД ММ ГГГГ"


        //наступило ли некоторое время
        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                 //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");

        Date startTime = new Date();

        long endTime = startTime.getTime() + 2999;   //    +2.999 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime = new Date();
        if (currentTime.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }

        //сколько времени прошло с начала суток
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

        //сколько времени прошло с начала года
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);

        InputStream inStream = new FileInputStream("c:/source.txt");
        OutputStream outStream = new FileOutputStream("c:/result.txt");

        System.out.println(inStream.available());

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();

*/
        class MyClass
        {
            private ArrayList<Integer> list = new ArrayList<Integer>();
            public void write(int data)
            {
                list.add(data);
            }
            public int read()
            {
                int first = list.get(0);
                list.remove(0);
                return first;
            }

            public int available()
            {
                return list.size();
            }
        }

        MyClass myObject = new MyClass();
        for (int i = 12; i < 1200; i++) {
            myObject.write(i);
        }

        OutputStream outStream = new FileOutputStream ("c:/my-object-data.txt");

        while (myObject.available() > 0)
        {
            int data = myObject.read(); //читаем один int из потока для чтения
            outStream.write(data); //записываем прочитанный int в другой поток.
        }

        outStream.close();
    }
}

