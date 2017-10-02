package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0 || args.length > 1) throw new IllegalArgumentException();
        String tag = args[0];
        //String tag = "span";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        //Собираем мощную единую строку
        String text = "";
        while (fileReader.ready()) {
            text = text + fileReader.readLine();
        }
        fileReader.close();
        //System.out.println(text);
        //Ок, собрали. Теперь удаляем из неё все знаки переноса строки (или каретки)
        text = text.replaceAll("\\r\\n", "");
        //System.out.println(text);
        //Теперь проходимся по всей этой строке, фиксируя вхождение подстроки с открытым тэгом (вида "<tag")
        //и закрытым тэгом (вида "</tag"). Каждый такой результат мы вносим в Map<Integer, Integer>, где
        //Ключ - это номер вхождения подстроки, а Value - это тип тэга. Для открытого - это 1, для закрытого - 0.
        //Используем TreeMap, так как эта мапа отсортирована по ключу, а в нашем случае ключ - это номер вхождения подстроки, что и нужно.
        int tagSize = tag.length(); //размер строки тэга. Например, для span это 4. Нужно чтоб подстроку высчитывать
        TreeMap<Integer, Integer> map = new TreeMap<>();
        //проверяем не до конца строки, а до минус "кол-во символов в span + 3 символа на < / >
        //а так как text.length на единицу больше, чем последний допустимый символ, то остается tagSize+2
        for (int i = 0; i < text.length()-(tagSize + 2); i++) {
            if (text.substring(i, i + tagSize + 1).equals("<" + tag)) { //тэг открытия
                map.put(i, 1);
            } else if (text.substring(i, i + tagSize + 3).equals("</" + tag + ">")) { //тэг закрытия
                map.put(i, 0);
            }
        }
        //System.out.println(map);
        //Мы получили мапу, где ключи - это номера символов вхождения тэгов, а значения - тип тэга
        //1 - открытие, 0 - закрытие
        //Теперь перегоним мапу в 2 списка - ключи и значения отдельно
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        ArrayList<Integer> values = new ArrayList<>(map.values());
        //System.out.println(keys);
        //System.out.println(values);
        //Идем по значениям (это массив вида 1 0 1 0 1 1 0 0 1 0), связываем и формируем строки для вывода
        //Логика такая - если идут подряд 2 единицы, то открытый и закрытый тэг связываются i // i + 3
        //А если идет 1, а затем сразу 0, то они связываются. Нули просто пропускаются, так как это закрывающиеся тэги
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == 1) {
                if (values.get(i + 1) == 1) { //если идут подряд 2 единицы
                    System.out.println(text.substring(keys.get(i), keys.get(i + 3) + tagSize + 3)); //формирование подстроки. Не забываем добавить символы на слеши и треугольные скобки
                } else if (values.get(i + 1) == 0) { //если следом за ним идет закрывающийся тэг
                    System.out.println(text.substring(keys.get(i), keys.get(i + 1) + tagSize + 3));
                }
            } //нули вообще игнорируются
        }
    }
}
