/// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;

class Z1 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введите натуральное число n ");
        n = scn.nextInt();
        System.out.printf("Треугольное число для n равно: ", n, getTriangleNumber(n));
        System.out.println();
        System.out.printf("Факториал числа n равен: ", n, getFactorial(n));
        scn.close();
    }
}