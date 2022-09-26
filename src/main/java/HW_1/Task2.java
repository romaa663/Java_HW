package HW_1;

/**
 *   Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 *   Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 *   Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class Task2 {
    public static void main(String[] args) {
        double operand1 = 54.78;
        double operand2 = 23.05;
        char operation = '+';
        calculator(operand1, operand2, operation);
    }

    private static void calculator(double operand1, double operand2, char operation) {
        double result = Double.NaN;
        switch (operation) {
            case ('+'):
                result = operand1 + operand2;
                break;
            case ('-'):
                result = operand1 - operand2;
                break;
            case ('*'):
                result = operand1 * operand2;
                break;
            case ('/'):
                result = operand1 / operand2;
                break;
            default:
                break;
        }

        System.out.printf("Параметры: operand1 = %f, operand2 = %f, operation = '%c'", operand1, operand2, operation);
        System.out.println("\nРезультат: " + result);
    }
}
