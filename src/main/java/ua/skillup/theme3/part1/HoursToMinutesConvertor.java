package ua.skillup.theme3.part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        if (hours > 35791394 || hours < 0) {
            throw new IllegalArgumentException("Hours can't be more than 35791394 and less than 0");
        }
        return hours * 60;
    }

    public static int convertHoursToSeconds(int hours) {
        if (hours > 596523 || hours < 0) {
            throw new IllegalArgumentException("Hours can't be more than 596523 and less than 0");
        }
        return hours * 60 * 60;
    }

    public static void main(String[] args) {
        int hours = 35791399;
        int result = convertHoursToMinutes(hours);
        System.out.println(result);
        result = convertHoursToSeconds(hours);
        System.out.println(result);
    }
}
