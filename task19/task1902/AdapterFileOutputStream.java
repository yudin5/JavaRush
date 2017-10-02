package com.javarush.task.task19.task1902;

/* 
Адаптер
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {

    //Приватное поле
    private FileOutputStream fileOutputStream;

    public static void main(String[] args) {

    }

    //Конструктор
    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        byte[] bytes = s.getBytes();
        fileOutputStream.write(bytes);
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}

