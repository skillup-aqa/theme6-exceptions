package ua.skillup.theme3.part3;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        for (int i = 1; i <= years; i++) {
            principal += principal * rate;
            System.out.println("Year " + i + ": " + principal);
        }
    }

    public static void main(String[] args) {
        printFutureValue(1000, 0.05, 10);
    }
}
