package com.inter.basics;

public class ZipCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file2,String file1) {
        String[] zippedFiles=new String[2];
        zippedFiles[0]=file1;
        zippedFiles[1]=file2;
        return zippedFiles;
    }
}
