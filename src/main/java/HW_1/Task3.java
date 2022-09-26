package HW_1;

/**
 *   Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 *   Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 */

public class Task3 {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 7;
        int a2 = 34;
        int b2 = 25;
        double s1 = areaTriangle(a1, b1);
        double s2 = areaTriangle(a2, b2);
        System.out.println("Площадь треугольника 1: " + s1);
        System.out.println("Площадь треугольника 2: " + s2);
        System.out.println("Площадь 1-го треугольника " + compareArea(s1, s2) + " площади 2-го треугольника.");
    }

    private static double areaTriangle(int a, int b) {
        return 0.5 * a * b;
    }

    private static String compareArea(double s1, double s2) {
        if (s1 < s2) return "меньше";
        else if (s1 > s2) return "больше";
        else return "равна";
    }
}
