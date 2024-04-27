package ua.skillup.theme3.part1;

public class DivisionWithRemainderCalculator {
    public static int calculateRemainder(int dividend, int divisor) {
       if (divisor == 0) {
           throw new IllegalArgumentException("Divisor can't be 0");
        }
        return dividend % divisor;
    }

    public static void main(String[] args) {
        int dividend = 2;
        int divisor = 4;
        int result = calculateRemainder(dividend, divisor);
        System.out.println(result);
    }
}
