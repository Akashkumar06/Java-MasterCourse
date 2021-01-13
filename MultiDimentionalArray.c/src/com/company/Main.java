package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int p[][][] = new int[4][4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    p[i][j][k] = i + j + k;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.printf("%d %n", p[i][j][k]);
                }
                System.out.println();
            }
        }


    }

}