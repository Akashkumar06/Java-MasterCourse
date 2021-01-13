public class Controller {
    public static void main( String[] args ) {
        Test ex = new Test();
        int sum2 = ex.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);
        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);
        int sum4 = ex.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}
