package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Tigrenok on 28.08.2017.
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws Exception
    {
        //создаем объект FileInputStream, привязанный к файлу «c:/data.txt».
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        long sum = 0;

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            sum += data; //добавить его к общей сумме
            outputStream.write(data);
        }

        inputStream.close(); // закрываем поток
        outputStream.close();

        System.out.println(sum); //выводим сумму на экран.
    }
}
