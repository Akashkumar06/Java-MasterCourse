import java.util.Scanner;
class Test4{
     public static void main(String arg[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a=in.nextInt();
        int k=1;
        for(int i=1;i<=a;i++){
		
	   for(int j=1;j<=i;j++){
		
		System.out.print(k++ +" ");
		
		}
	    System.out.println(" ");
		}
	}
}
	
	