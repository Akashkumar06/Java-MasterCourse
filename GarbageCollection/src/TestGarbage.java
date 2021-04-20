public class TestGarbage {
    public void finalize(){
        System.out.println("Object is Garbage Colledcted");
    }
    public static void main(String arg[]){
        TestGarbage t1=new TestGarbage();
        TestGarbage t2=new TestGarbage();
        t1=null;
    }
}
