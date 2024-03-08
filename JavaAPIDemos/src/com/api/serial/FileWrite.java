package com.api.serial;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(iReader);
        System.out.println("Enter ");
        char c = 0;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("demo.txt");
            c = (char) bufferedReader.read();
            while (c != 'g') {
                // System.out.print(c);
                fileOutputStream.write(c);
                c = (char) bufferedReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException i) {
                i.printStackTrace();
            }
        }


    }
}
