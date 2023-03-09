/*
 * Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций
*/

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "Cp866");
        System.out.print("Введите слово: ");
        String wordpolindrom = input.nextLine();
        char[] charArray = wordpolindrom.toCharArray();
        boolean flag = true;
        for (int i = 0; i < charArray.length/2; i++) {
            if(charArray[i] != charArray[charArray.length-1-i])
            {
                flag = false;
            }
        }
        if(flag)
        {
            System.out.println("This is polindrom");
        }
        else
        {
            System.out.println("This is not polindrom");
        }
    }
}
