package com.company;

public class Main {

    public static void main(String[] args) {
        int m []= {1, 4, 7, 5, 2, 7, 5};
        int max=m[0];
        int n=0;
        for (int i=0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        for (int i=0; i < m.length; i++){
            if (m[i] == max) {
                    n = n + 1;
            }
        }
        System.out.println("Максимальное число " + max + " встречается " + n + " раз");
    }
}
