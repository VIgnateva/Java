package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("aaaddd");
        String s2 = "bbbccc";
        s1.insert(s1.length()/2, s2);
        System.out.println(s1);
    }
}
