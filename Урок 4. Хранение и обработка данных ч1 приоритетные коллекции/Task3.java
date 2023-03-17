import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double num1 =0;
            double num2 =0;
            double result = 0;
            String operator = "";
            boolean cancelled = false;

            while (true) {
                if(cancelled == false){
                System.out.print("Input: ");

                if (cancelled) {
                    operator = "";
                    cancelled = false;
                } else if (!operator.isEmpty()) {
                    num1 = result;
                    System.out.print(num1 + " \n");
                } else {
                    num1 = input.nextDouble();
                }
                
                System.out.print("Input: ");
                String tempOp = input.next();
                if (tempOp.equals("cancel")) {
                    operator = "";
                    cancelled = true;
                    continue;
                }

                

                    if (!tempOp.matches("[-+*/]")) {
                        System.out.println("Invalid operator!");
                        continue;
                    }

                    operator = tempOp;

                    System.out.print("Input: ");
                    num2 = input.nextDouble();

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                }
                cancelled = false;

                System.out.print("Output: " + result +"\n");
            }
        }
    }
}