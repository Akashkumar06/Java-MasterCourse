import java.util.Scanner;
class Test1{
     public static void main(String arg[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a=in.nextInt();
        for(int i=0;i<a;i++){
	   for(int j=0;j<=i;j++){
		System.out.print("*");
		}
	    System.out.println("");
		}
	}
}
	
	