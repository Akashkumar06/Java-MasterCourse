package com.company;

 class Main {

    public static void main(String[] args) {
        BoxDemo b =new BoxDemo();
        double vol;
        b.height=5;
        b.width=6;
        b.length=10;
        vol=b.height*b.width*b.length;
        System.out.println(vol);

    }
}
