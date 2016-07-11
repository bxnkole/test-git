package com.banks;

import org.apache.commons.io.FileUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(FileUtils.getTempDirectoryPath());
    }
}
