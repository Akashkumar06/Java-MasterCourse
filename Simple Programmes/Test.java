import java.util.Scanner;
class Test{
     public static void main(String arg[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a=in.nextInt();
        for(int i=1;i<=a;i++){
	   for(int j=i;j<=a;j++){
		System.out.print("*");
		}
		System.out.println();
		}
	}
}
	
	