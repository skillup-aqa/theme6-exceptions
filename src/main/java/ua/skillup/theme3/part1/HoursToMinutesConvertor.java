package ua.skillup.theme3.part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        return hours * 60;
    }

    public static int convertHoursToSeconds(int hours) {
        return hours * 60 * 60;
    }

    public static void main(String[] args) {
        int hours = 1;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
