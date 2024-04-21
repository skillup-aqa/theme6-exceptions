package ua.skillup.theme3.part3;

public class CollatzConjectureTester {
    public static int collatzConjecture(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The entered number can't be less than 0");
        }
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = collatzConjecture(n);
        System.out.println(result);
    }
}
