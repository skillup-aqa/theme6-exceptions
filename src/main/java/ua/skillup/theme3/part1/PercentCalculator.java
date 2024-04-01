package ua.skillup.theme3.part1;

public class PercentCalculator {
    public static double calculatePercent(double number, double percent) {
        return number * percent / 100;
    }

    public static void main(String[] args) {
        double number = 100;
        double percent = 10;
        double result = calculatePercent(number, percent);
        System.out.println(result);
    }
}
