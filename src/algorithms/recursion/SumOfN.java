package algorithms.recursion;

public class SumOfN {

    public int sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        SumOfN s = new SumOfN();

        int sum = s.sum(5);
        System.out.println("sum is " + sum);
    }
}