// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        int n = input.nextInt();

        int triangularNumber = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
            factorial *= i;
        }

        System.out.println("The triangular number 1 + 2 + 3 + ... + " + n + " = " + triangularNumber);
        System.out.println("n! = " + factorial);
    }
}