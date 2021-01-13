public class Test {
    public int sumNumber(int... args) {
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }
}