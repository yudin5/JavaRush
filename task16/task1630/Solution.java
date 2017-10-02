package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String content = "";
        File myFile;
        @Override
        public void setFileName(String fullFileName) {
            myFile = new File(fullFileName);
        }

        @Override
        public String getFileContent() {
            return content;
        }

        public void run() {
            try {
                FileReader fileReader = new FileReader(myFile);
                BufferedReader fileBufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = fileBufferedReader.readLine()) != null) {
                    content = content + " " + line;
                }
            } catch (IOException ex) {
                System.out.println("Нет такого файла!");
            }
        }
    }
}
