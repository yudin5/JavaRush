package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {

    private FileWriter fileWriter;

    //КОНСТРУКТОРЫ
    public FileConsoleWriter(File file) {
        try {
            this.fileWriter = new FileWriter(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public FileConsoleWriter(File file, boolean append) {
        try {
            this.fileWriter = new FileWriter(file, append);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public FileConsoleWriter(FileDescriptor descriptor) {
        this.fileWriter = new FileWriter(descriptor);
    }

    public FileConsoleWriter(String fileName) {
        try {
            this.fileWriter = new FileWriter(fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public FileConsoleWriter(String fileName, boolean append) {
        try {
            this.fileWriter = new FileWriter(fileName, append);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //МЕТОДЫ
    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        char[] newCbuf = new char[len];
        for (int i = 0; i < newCbuf.length; i++) {
            newCbuf[i] = cbuf[off + i];
        }
        System.out.println(newCbuf);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) {
        System.out.println(str.substring(off, off + len));
        try {
            fileWriter.write(str, off, len);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(cbuf);
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public static void main(String[] args) {

    }

}
