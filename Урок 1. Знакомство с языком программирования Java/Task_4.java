// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Запросить у пользователя ввод уравнения
        System.out.print("Введите уравнение в формате q + w = e, где некоторые цифры заменены на знак вопроса: ");
        String equation = input.nextLine();

        // Разделить уравнение на q, w и e
        String[] parts = equation.split(" ");
        String q = parts[0];
        String w = parts[2];
        String e = parts[4];

        // Перебрать все возможные цифры для q, w и e
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    // Заменить знаки вопроса на цифры
                    String q1 = q.replace("?", String.valueOf(i));
                    String w1 = w.replace("?", String.valueOf(j));
                    String e1 = e.replace("?", String.valueOf(k));

                    // Проверить, является ли уравнение верным
                    if (isValid(q1, w1, e1)) {
                        System.out.printf("%s + %s = %s", q1, w1, e1);
                        return;
                    }
                }
            }
        }

        // Если допустимое решение не найдено, вывести сообщение об ошибке
        System.out.println("Допустимое решение не найдено.");
    }

    // Проверить, является ли уравнение верным
    public static boolean isValid(String q, String w, String e) {
        int qVal = Integer.parseInt(q);
        int wVal = Integer.parseInt(w);
        int eVal = Integer.parseInt(e);

        return qVal + wVal == eVal && qVal >= 0 && wVal >= 0 && eVal >= 0;
    }
}
