import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Enter first number:");
        num1 = input.nextDouble();

        System.out.println("Enter second number:");
        num2 = input.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        operator = input.next().charAt(0);

        switch(operator) {
            case '+':
                result = num1 + num2;
                logCalculation(num1, num2, operator, result);
                break;
            case '-':
                result = num1 - num2;
                logCalculation(num1, num2, operator, result);
                break;
            case '*':
                result = num1 * num2;
                logCalculation(num1, num2, operator, result);
                break;
            case '/':
                result = num1 / num2;
                logCalculation(num1, num2, operator, result);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static void logCalculation(double num1, double num2, char operator, double result) {
        try {
            FileWriter fw = new FileWriter("calculations.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(num1 + " " + operator + " " + num2 + " = " + result);
            pw.close();
        } catch (Exception e) {
            System.out.println("Error logging calculation to file");
        }
    }
}
