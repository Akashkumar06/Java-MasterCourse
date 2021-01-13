import java.util.Scanner;
class Hope{
     public static void main(String arg[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a=in.nextInt();
        for(int i=1;i<=a;i++){
		for(int j=a;j>i;j++){
			System.out.print(" ");
		}
			for(int k=0;k<a;k++)
				System.out.print(" *");
	          System.out.println(" ");
		}
	}
}
	
	