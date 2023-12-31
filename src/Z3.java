// Реализовать простой калькулятор (+ - / *)


import java.util.Scanner;

public class Z3 {
    static int getSum(int a, int b) {
        return a + b;
    }

    static int getSubtraction(int a, int b) {
        return a - b;
    }

    static int getProduct(int a, int b) {
        return a * b;
    }

    static double getDivision(int a, int b) {
        return (double) a / (double) b;
    }

    static void printResultOfOperation(int a, int b, String signOperation) {
        switch (signOperation) {
            case "+":
                System.out.printf("%d %s %d = %d \n", a, signOperation, b, getSum(a, b));
                break;
            case "-":
                System.out.printf("%d %s %d = %d \n", a, signOperation, b, getSubtraction(a, b));
                break;
            case "*":
                System.out.printf("%d %s %d = %d \n", a, signOperation, b, getProduct(a, b));
                break;
            case "/":
                if (b != 0) {
                    System.out.printf("%d %s %d = %.4f \n", a, signOperation, b, getDivision(a, b));
                } else {
                    System.out.println("Деление на НОЛЬ!");
                }
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = sc.nextInt();

        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите знак операции: +, -, *, /: ");
        String signOperation = scn.nextLine();

        System.out.printf("Введите второе число: ");
        int b = sc.nextInt();

        System.out.printf("Результат вычисления: ");
        printResultOfOperation(a, b, signOperation);

        sc.close();
        scn.close();
    }
}