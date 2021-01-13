
import java.util.Scanner;
public class TestCircle {  
   public static void main(String[] args) {
   String color;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter The Radius Of Circle");
   double radiusOfCircle=sc.nextDouble();
   color=sc.nextLine();
     System.out.println("  "+color);
      Circle c1 = new Circle(radiusOfCircle,color);
   
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea()+"colour of "+ c1.getColor());
   
  
      //Circle c2 = new Circle(2.0,"blue");
      
      //System.out.println("The circle has radius of " 
  //         + c2.getRadius() + " and area of " + c2.getArea()+"  colour of "+ c2.getColor());

   }
}