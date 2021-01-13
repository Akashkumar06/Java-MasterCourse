import java.util.Scanner;

public class Insurance{
  public static void main(String args[]){
    int age, fine=0, count=0, condition, country;
    double premium=0, costOfCar;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    System.out.println("Enter cost of your car: ");
    costOfCar = sc.nextDouble();
    System.out.println("Is the car in good condition?\n1. Yes\n2. No");
    condition = sc.nextInt();
    System.out.println("Where did you buy your car?\n1. India\n2. Abroad");
    country = sc.nextInt();

    if(age>=25&&country==1&&condition==1){
      fine = 0;
      premium = 0.06*costOfCar + fine;
      count=1;
    }
    if(age>=25&&country==1&&condition==2){
      fine = 100;
      premium = 0.07*costOfCar + fine;
      count=1;
    }
    if(age<25&&country==1&&condition==1){
      fine = 0;
      premium = 0.09*costOfCar + fine;
      count=1;
    }
    if(age<25&&country==1&&condition==2){
      fine = 500;
      premium = 0.1*costOfCar + fine;
      count=1;
    }

    if(count==1)
    System.out.println("You have to pay a premium of Rs. "+premium+" including a fine of Rs. "+fine);
    else
    System.out.println("Invalid Credentials!");
  }
}
