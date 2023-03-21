/*
 * Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCounts = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedCounts = new ArrayList<>(nameCounts.entrySet());
        sortedCounts.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedCounts) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

