package ua.skillup.theme3.part2;

public class PointsToMarksConvertor {
    public static char convertPointsToMarks(int points) {
        // Assume that points are always non-negative integers and less than 100
        if (points < 60) {
            return 'F';
        } else if (points < 75) {
            return 'D';
        } else if (points < 85) {
            return 'C';
        } else if (points < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public static void main(String[] args) {
        int points = 90;
        char result = convertPointsToMarks(points);
        System.out.println(result);
    }
}
