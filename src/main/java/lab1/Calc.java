package lab1;

public class Calc {
    private char operation;
    private char[] operations = { '+', '-', '*', '/', '%' };

    public Calc setOperation(char operation) {
        if (!inArray(operation, operations)) {
            throw new IllegalArgumentException("Operation not supported");
        }

        this.operation = operation;

        return this;
    }

    public double calculate(double a, double b) {
        double result = 0;

        switch (this.operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
        }

        return result;
    }

    private boolean inArray(char element, char[] array) {
        for (char e : array) {
            if (e == element) {
                return true;
            }
        }

        return false;
    }
}
