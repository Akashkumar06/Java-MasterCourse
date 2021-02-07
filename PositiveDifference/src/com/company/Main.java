package com.company;
import  java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Number");
        int a=s.nextInt();


        if(a>0){

            System.out.println("Number is Positive Number Which is"+a);
        }
        else if(a<0){
            System.out.println("Number is Positive Number Which is"+a);


        }
        else {

            System.out.println("Number is Zero");

        }

    }
}
