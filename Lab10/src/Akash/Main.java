package Akash;

import static Akash.A.*;

public class Main {
    public static void main(String[] args){
        B obj1 =new B(5);

    }
}
class A {
    int i = 10;

    public A() {
        System.out.println(i);
    }

    public A(int i) {

        System.out.println(i + 11);
    }
}

class B extends A {
    public B(int i){
        super(5);
        System.out.println("Hi from B"+" "+i);

    }
}