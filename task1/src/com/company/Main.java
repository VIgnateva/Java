package com.company;

public class Main {

    public static void main(String[] args) {
	int n =10;
        if (n > 0 & n < 100) {
            for (int i = 0; i < n; i++) {
                for (int k = 1; k < n - i; k++) {
                    System.out.print(" ");
                }
                for (int s = 1; s <= i * 2 + 1; s++) {
                    System.out.print("*");
                }
                if (i != n - 1) {
                    System.out.println();
                }
            }
        }
        else {
            System.out.println("Введена некорректная высота");
        }
    }
}
