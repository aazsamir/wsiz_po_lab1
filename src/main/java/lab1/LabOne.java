package lab1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LabOne {
    public static void printNameAndAge() {
        System.out.println("Samir 21");
    }

    public static void getTwoNumbersAndPrintCalculations() {
        int[] numbers = getTwoNumbers();
        printCalculations(numbers[0], numbers[1]);
    }

    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public static boolean isDivisibleBy3And5(int number) {
        return (number % 3 == 0)
                && (number % 5 == 0);
    }

    public static double toPower3(double number) {
        return Math.pow(number, 3);
    }

    public static boolean isTriangable(int a, int b, int c) {
        return (a * a) + (b * b) == (c * c);
    }

    private static int getInt() {
        System.out.println("Enter an integer:");

        return new Scanner(System.in).nextInt();
    }

    public static boolean getTwoNumbersAndCheckTriangability() {
        int[] range = new int[2];
        range[0] = getInt();
        range[1] = getInt();

        int N = 3;
        int[] numbers = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(range[1] - range[0] + 1) + range[0];
        }

        Arrays.sort(numbers);

        for (int r : numbers) {
            System.out.print(r);
            System.out.print(", ");
        }

        System.out.println();

        return isTriangable(numbers[0], numbers[1], numbers[2]);
    }

    private static int[] getTwoNumbers() {
        System.out.println("Enter two numbers: ");
        int[] numbers = new int[2];
        numbers[0] = getInt();
        numbers[1] = getInt();

        return numbers;
    }

    private static void printCalculations(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
    }
}
