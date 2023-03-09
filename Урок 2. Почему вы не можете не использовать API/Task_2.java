/**
 * Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Task_2 {
    public static void main(String[] args) {
        try {
            File file = new File("name.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file, StandardCharsets.UTF_8);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            String line2 = line.replace("\"", "");
            String[] allstr = line2.split(",");
            String[] name = allstr[0].split(":");
            String[] evalution = allstr[1].split(":");
            String[] lesson = allstr[2].split(":");
            System.out.printf("Студент %s получил %s по предмету %s. \n", name[1],evalution[1],lesson[1]);
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if(line != null){
                    line2 = line.replace("\"", "");
                    allstr = line2.split(",");
                    name = allstr[0].split(":");
                    evalution = allstr[1].split(":");
                    lesson = allstr[2].split(":");
                    System.out.printf("Студент %s получил %s по предмету %s. \n", name[1],evalution[1],lesson[1]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
