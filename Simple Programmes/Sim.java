import java.util.Scanner;
class Sim{
     public static void main(String arg[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=in.nextInt();
 
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
 
    }
 
}
 