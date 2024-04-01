package ua.skillup.theme3.part2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Read about leap years here: https://en.wikipedia.org/wiki/Leap_year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2020;
        boolean result = isLeapYear(year);
        System.out.println(result);
    }
}
