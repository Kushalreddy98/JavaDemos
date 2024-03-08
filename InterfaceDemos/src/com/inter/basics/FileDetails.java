package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor compressor=new JarCompressor();
        String[] file= compressor.compressFiles("java","python");
        for(String s:file)
            System.out.println(s);
        System.out.println();
        compressor=new ZipCompressor();
        String [] file2=compressor.compressFiles("C#","ruby");
        for(String s2:file2)
            System.out.println(s2);
    }
}
