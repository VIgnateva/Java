package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String text ="ILoveJavaProgramming";
        String[] s = text.split("(?=[A-Z])");
        for(String string : s){
            System.out.println(string);
        }
    }
}
