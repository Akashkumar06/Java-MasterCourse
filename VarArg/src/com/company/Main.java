package com.company;

public class Main {

    public static void main(String[] args) {
        Display dsp=new Display();
        dsp.show(5);
    }
}
class Display {
    void show(int... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

     void show(int a) {
        System.out.println(a + "This is in  Secound Loop");
    }
}

