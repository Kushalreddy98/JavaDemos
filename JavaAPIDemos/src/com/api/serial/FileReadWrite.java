package com.api.serial;

import java.io.*;


public class FileReadWrite {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;


        try {
            fileWriter = new FileWriter("trail1.txt");
            fileReader = new FileReader("demo.txt");
            int num = fileReader.read();
            fileWriter.write((char) num);
            do {
                num = fileReader.read();
                fileWriter.write((char) num);
            } while ((num != -1));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
