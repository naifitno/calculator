import java.math.BigDecimal;

public class Calculator {
    enum ArithmeticOperations {
        ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION;
    }

    private BigDecimal calculate(BigDecimal x, BigDecimal y, ArithmeticOperations operation) {
        switch (operation) {
            case ADDITION:
                return x.add(y);
            case SUBTRACTION:
                return x.subtract(y);
            case MULTIPLICATION:
                return x.multiply(y);
            case DIVISION:
                return x.divide(y);
        }

        return BigDecimal.ZERO;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        BigDecimal x = BigDecimal.valueOf(10);
        BigDecimal y = BigDecimal.valueOf(5);

        System.out.println(calculator.calculate(x, y, ArithmeticOperations.ADDITION));
        System.out.println(calculator.calculate(x, y, ArithmeticOperations.SUBTRACTION));
        System.out.println(calculator.calculate(x, y, ArithmeticOperations.MULTIPLICATION));
        System.out.println(calculator.calculate(x, y, ArithmeticOperations.DIVISION));

    }
}
