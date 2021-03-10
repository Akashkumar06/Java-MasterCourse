package com.company;
import java.util.*;

public class  bubbleSort1{

    static void bubbleSort(int [] arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;i<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[i];
                    arr[i]=temp;
                }
            }
        }

    }
}


public class Main {

    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Values");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        bubbleSort(arr);
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);

    }
}
