import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        System.out.println("Перед удалением четных чисел: " + numbers);
        removeOddNumbers(numbers);
        System.out.println("После удаления четных чисел: " + numbers);
    }

    public static void removeOddNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
