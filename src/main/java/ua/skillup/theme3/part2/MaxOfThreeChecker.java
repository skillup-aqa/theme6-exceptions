package ua.skillup.theme3.part2;

public class MaxOfThreeChecker {
    public static int maxOfThree(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int result = maxOfThree(number1, number2, number3);
        System.out.println(result);
    }
}
