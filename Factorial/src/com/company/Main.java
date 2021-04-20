package com.company;
import java.util.*;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter A Number: ");
        int n=sc.nextInt();

       BigInteger factorial=BigInteger.ONE;
        for(int i=n;i>1;i--){
//           factorial*=i; im commented this line because it's only working for the samall inputs less than 13
           factorial=factorial.multiply(BigInteger.valueOf(i));
       }

      System.out.println("Factorial Of "+n+" Given Number is "+factorial);

    }
}
