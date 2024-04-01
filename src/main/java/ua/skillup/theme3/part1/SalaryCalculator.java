package ua.skillup.theme3.part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        return hoursPerMonth * hourlyRate;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double salaryAfterTaxes = calculateSalaryBeforeTaxes(hoursPerMonth, hourlyRate) * 0.95 - 1562;
        return Math.round(salaryAfterTaxes * 100) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
