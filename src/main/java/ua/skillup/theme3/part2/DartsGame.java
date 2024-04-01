package ua.skillup.theme3.part2;

public class DartsGame {
    public static int getScore(double x, double y) {
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= 1) {
            return 10;
        } else if (distance <= 5) {
            return 5;
        } else if (distance <= 10) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double x = 1.0;
        double y = 1.0;
        int result = getScore(x, y);
        System.out.println(result);
    }
}
