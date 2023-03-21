import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568*/
/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> phonebook = new HashMap<>();
        ArrayList<String> number;

        try (Scanner input = new Scanner(System.in, "Cp866")) {
            for(;;){

                ShowManual();

                String want = input.nextLine();

                if(Integer.parseInt(want) == 1){
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter pfone: ");
                    String phone = input.nextLine();
                    if(phonebook.containsKey(name)){
                        phonebook.get(name).add(phone);
                    }
                    else{
                        number = new ArrayList<>();
                        number.add(phone);
                        phonebook.put(name, number);
                    }
                }
                else if (Integer.parseInt(want) == 2) {
                    printMap(phonebook);
                } 
                else {
                    System.out.println("I don't know what you want.");
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void ShowManual () {
        System.out.println();
        System.out.println("Manual:\nEnter 1 Добавление номера\nEnter 2 Вывод всего\n");
    }

    public static void printMap (Map<String,ArrayList<String>> map) {
        for(String key : map.keySet()){
            System.out.print(key + " : " );
            for (int i = 0; i < + map.get(key).size(); i++) {
                System.out.print(map.get(key).get(i));
                if(map.get(key).size()-1 != i ){
                    System.out.print(", ");
                }
                else{
                    System.out.println();
                }
            }
        }
    }
}