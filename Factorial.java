
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter A Number: ");
        int n=sc.nextInt();

        int factorial=1;
        for(int i=n;i>1;i--){
//           factorial*=i; im commented this line because it's only working for the samall inputs less than 11
           factorial*=i;
       }

      System.out.println("Factorial Of "+n+" Given Number is "+factorial);

    }
}
