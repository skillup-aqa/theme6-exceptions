package ua.skillup.theme3.part1;

public class ArithmeticMeanCalculator {
    public static double calculateArithmeticMean(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double result = calculateArithmeticMean(a, b, c);
        System.out.println(result);
    }
}
