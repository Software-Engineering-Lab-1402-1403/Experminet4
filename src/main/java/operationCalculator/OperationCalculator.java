package operationCalculator;

public class OperationCalculator {
    public float applyOperator(int a, int b, char operator) {
        switch (operator) {
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return (float) a / b;
            case '^':
                return power(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    private float power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / (base * power(base, -exponent - 1));
        }
    }
}
