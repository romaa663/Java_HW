package HW_1;

/**
 *   В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 *   Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {
        for (int minutes = 0; minutes < 60; minutes++) {
            countTime(minutes);
        }
    }

    private static void countTime(int minutes) {
        if (minutes >= 0 && minutes <= 15) System.out.println(minutes + " минута - 1-я четверть");
        else if (minutes > 15 && minutes <= 30) System.out.println(minutes + " минута - 2-я четверть");
        else if (minutes > 30 && minutes <= 45) System.out.println(minutes + " минута - 3-я четверть");
        else if (minutes > 45 && minutes <= 59) System.out.println(minutes + " минута - 4-я четверть");
        else if (minutes < 0 | minutes > 59) System.out.println("Неверное время");
    }
}
