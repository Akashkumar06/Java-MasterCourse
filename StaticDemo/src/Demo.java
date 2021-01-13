public class Demo {
    public static void main(String arg[]){
        A.num2=5;
        A obj1=new A();
        A obj2=new A();
        A obj3=new A();
        obj1.num1=100;
        obj2.num1=500;
        System.out.println(A.num2);
        obj1.show();
        System.out.println(A.num2);
        A.print();
        System.out.println(obj1.num1);
        System.out.println(obj2.num1);




    }
}
