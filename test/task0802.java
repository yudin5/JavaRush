//package com.javarush.task.task08.task0802;

/*
HashMap из 10 пар
Требования:
1. Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 пар строк, согласно условию.Например, значение — ягода, ключ — арбуз.
арбуз — ягода,
банан — трава,
вишня — ягода,
груша — фрукт,
дыня — овощ,
ежевика — куст,
жень-шень — корень,
земляника — ягода,
ирис — цветок,
картофель — клубень.
4. Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task0802 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> hMap = new HashMap<String, String>();
        //наполняем коллекцию
        hMap.put("арбуз", "ягода");
        hMap.put("банан", "трава");
        hMap.put("вишня", "ягода");
        hMap.put("груша", "фрукт");
        hMap.put("дыня", "овощ");
        hMap.put("ежевика", "куст");
        hMap.put("жень-шень", "корень");
        hMap.put("земляника", "ягода");
        hMap.put("ирис", "цветок");
        hMap.put("картофель", "клубень");
        //выводим на экран
        Iterator<Map.Entry<String, String>> iterator = hMap.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + " - " + value);
        }
    }
}
