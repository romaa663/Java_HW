package HW_2;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        long number = sc.nextLong();
        countEvenNumber(number);
        countOddNumber(number);
    }

    private static void countEvenNumber(long number) {
        int count = 0;
        while (number > 1) {
            if (number % 2 == 0) {
                count++;
                System.out.print(number % 10 + " ");
            }
            number /= 10;
        }
        System.out.println();
        System.out.println("Количество четных чисел: " + count);
    }

    private static void countOddNumber(long number) {
        int count = 0;
        while (number > 1) {
            if (number % 2 != 0) {
                count++;
                System.out.print(number % 10 + " ");
            }
            number /= 10;
        }
        System.out.println();
        System.out.println("Количество нечетных чисел: " + count);
    }
}
