package ua.skillup.theme3.part3;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        if (principal < 0) {
            throw new IllegalArgumentException("Principal can't be less than 0");
        }
        if (rate < 0) {
            throw new IllegalArgumentException("Rate can't be less than 0");
        }
        if (years < 0) {
            throw new IllegalArgumentException("Years can't be less than 0");
        }
        for (int i = 1; i <= years; i++) {
            principal += principal * rate;
            System.out.println("Year " + i + ": " + principal);
        }
    }

    public static void main(String[] args) {
        printFutureValue(1000, 0.05, -1);
    }
}
