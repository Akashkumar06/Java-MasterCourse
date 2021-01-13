package Akash;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two nums::");
        int x=sc.nextInt();
        int y=sc.nextInt();
        AddSub as=new AddSub(x,y);

        as.add();
        System.out.println(as.val);
        as.sub();
        System.out.println(as.val);

    }
}
class Add{
    int a ,b,val;


    public void add(){
        val=a+b;


    }

}
class AddSub extends Add{


    public void sub(){
        val=a-b;
    }


}
