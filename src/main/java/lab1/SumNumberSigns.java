package lab1;

public class SumNumberSigns {
    private int[] numbers;
    private final int COUNT = 32;

    public SumNumberSigns setNumbers(int[] numbers) {
        this.numbers = numbers;

        return this;
    }

    public int[] getRandomNumbers() {
        int[] numbers = new int[this.COUNT];

        for (int i = 0; i < this.COUNT; i++) {
            numbers[i] = (int) (Math.random() * 100) - 50;
        }

        return numbers;
    }

    public void printNumberSignsCount() {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int number : this.numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);
    }

    public int sumPositives() {
        int sum = 0;

        for (int number : this.numbers) {
            if (number > 0) {
                sum += number;
            }
        }

        return sum;
    }
}
