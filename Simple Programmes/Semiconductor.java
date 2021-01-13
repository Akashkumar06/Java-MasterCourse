import java.util.Scanner;

public class Semiconductor{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		int typeOfMC, typeOfCustomer, amount;
		double  payable, budget;
		System.out.println("1. Industry\n2. Government\n3. University");
		System.out.println("Enter customer type: ");
		typeOfCustomer = sc.nextInt();
		System.out.println("1. 8 bit\n2. 16 bit\n3. 32 bit");
		System.out.println("Enter type of microprocessor you want: ");
		typeOfMC = sc.nextInt();
		System.out.println("Enter no. of pieces you want: ");
		amount = sc.nextInt();
		System.out.println("Enter your budget: ");
		budget = sc.nextDouble();
		if(typeOfMC==1){
			System.out.println("You will get a 10% discount!");
			payable = budget - (0.1*budget);
			System.out.println("You have to pay Rs. "+payable);
		}
		else if(typeOfMC==2){
			if(amount<10000){
				System.out.println("No discount for you!");
				payable = budget;
				System.out.println("You have to pay Rs. "+payable);
			}
			else{
				if(typeOfCustomer==1||typeOfCustomer==3){
					System.out.println("You will get a 5% discount!");
					payable = budget - (0.05*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
				else{
					System.out.println("You will get a 6% discount!");
					payable = budget - (0.06*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
			}
		}
		else if(typeOfMC==3){
			if(amount<50000){
				if(typeOfCustomer==1){
					System.out.println("You will get a 5% discount!");
					payable = budget - (0.05*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
				else if(typeOfCustomer==2){
					System.out.println("You will get a 6.5% discount!");
					payable = budget - (0.065*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
			}
			else if(amount>=50000&&amount<100000){
				if(typeOfCustomer==1){
					System.out.println("You will get a 7.5% discount!");
					payable = budget - (0.075*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
				else if(typeOfCustomer==2){
					System.out.println("You will get a 8.5% discount!");
					payable = budget - (0.085*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
			}
			else if(amount>100000){
				if(typeOfCustomer==1){
					System.out.println("You will get a 10% discount!");
					payable = budget - (0.1*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
				else if(typeOfCustomer==2){
					System.out.println("You will get a 10% discount!");
					payable = budget - (0.1*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
			}
			else{
				System.out.println("You will get a 7.5% discount!");
					payable = budget - (0.075*budget);
					System.out.println("You have to pay Rs. "+payable);
				}
			}
		}
	}
