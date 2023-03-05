// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->


import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}