package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] m = {{1,8,9},{2,5,1},{3,4,5}};
        int d1 = 0;
        int d2 = 0;
        int r=0;
        for (int i=0; i < m.length; i++){
            for (int j=0; j < m[i].length; j++) {
                if (i==j) d1=d1+m[i][j];
                if (i+j==m.length-1) d2=d2+m[i][j];
            }
        }
        r=d1-d2;
        System.out.println(Math.abs(r));
    }
}
