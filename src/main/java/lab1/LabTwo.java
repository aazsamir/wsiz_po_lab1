package lab1;

public class LabTwo {
    public static void solveQuadraticEquation(float a, float b, float c) {
        float discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else if (discriminant == 0) {
            float root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            float root1 = (-b + (float) Math.sqrt(discriminant)) / (2 * a);
            float root2 = (-b - (float) Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: " + root1 + ", " + root2);
        }
    }

    public static int ax(int x) {
        if (x > 0) {
            return 2 * x;
        }

        if (x < 0) {
            return -3 * x;
        }

        return 0;
    }

    public static int bx(int x) {
        if (x >= 1) {
            return x * x;
        }

        return x;
    }

    public static int cx(int x) {
        if (x > 2) {
            return 2 + x;
        }

        if (x < 2) {
            return x - 4;
        }

        return 8;
    }

    public static int[] sort(int[] numbers) {
        boolean isSorted = false;

        while (isSorted == false) {
            isSorted = true;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        return numbers;
    }
}
