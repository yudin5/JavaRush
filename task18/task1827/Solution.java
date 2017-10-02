package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) throw new IllegalArgumentException(); //если запуск без параметров
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); //читаем имя файла
        reader.close();
        BufferedReader bis = new BufferedReader(new FileReader(fileName)); //буферизованный поток для чтения из файла

        if (args[0].equals("-c")) {
            //Генерируем id. Для этого сначала ищем максимальный id. Проходим по всем строкам в файле.
            int maxID = 0;
            String nextLine = bis.readLine(); //читаем строку
            while(nextLine != null) { //читаем до тех пор, пока не дойдем до конца файла
                String idToTest = nextLine.substring(0,8); //это первые 8 символов строки
                idToTest= idToTest.trim(); //обрезаем её, чтоб удалить пробелы
                maxID = maxID < Integer.parseInt(idToTest) ? Integer.parseInt(idToTest) : maxID; //сравниваем распарсенный ID с максимальным
                nextLine = bis.readLine();
            }

            int ourID = maxID + 1; //Итак, очередной ID для товара вычислен. Инкрементируем его.
            String stringOurID = ourID + ""; //переводим ID в строку
            if (ourID < 10_000_000) { //если символов меньше, чем 8
                while (stringOurID.length() != 8) stringOurID = stringOurID + " "; //дополняем пробелами до 8-ми символов
            } else if (ourID > 99_999_999) {
                stringOurID = 99_999_999 + "";
            }


            //Теперь генерим productName
            String productName = args[1];
            if (productName.length() > 30) productName = productName.substring(0, 30); //если имя товара длиннее 30-ти символов, то обрезаем до 30
            if (productName.length() < 30) {
                while (productName.length() != 30) productName = productName + " "; //если имя меньше, то дополняем пробелами до 30-ти символов
            }


            //Теперь разбираемся с price. С ценой делаем то же, что и с именем, но чтобы в писать в 8 символов.
            String price = args[2];
            if (price.length() > 8) price = price.substring(0, 8);
            if (price.length() < 8) {
                while (price.length() != 8) price = price + " ";
            }

            //Количество quantity. То же, но 4 символа
            String quantity = args[3];
            if (quantity.length() > 4) quantity = quantity.substring(0, 4);
            if (quantity.length() < 4) {
                while (quantity.length() != 4) quantity = quantity + " ";
            }


            //Тепер, когда все элементы определены, генерим результирующую строку
            String result = stringOurID + productName + price + quantity;

            //Записываем результирующую строку в конец файла
            FileWriter fileWriter = new FileWriter(fileName, true); //КОНСТРУКТОР, позволяющий дописать данные в конец файла
            fileWriter.write("\r\n");
            fileWriter.write(result);
            fileWriter.close();
        }
        bis.close();
    }
}
