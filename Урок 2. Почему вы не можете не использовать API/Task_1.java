import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;

/**
 * Lecture
 * 
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.

 */
public class Task_1 {

    public static void main(String[] args) {
        int[] mas = {1,2,3,4,4,5,56,78,12313,1231,1,23,4,5};
        int tmp =0;
        String FILENAME = "DODO.txt";
        File filePuzir = new File(FILENAME);
        try{
            FileWriter write = new FileWriter(filePuzir,false);
            write.write(Arrays.toString(mas)+"\n");
            for (int i = 0; i < mas.length-1; i++) {
                for (int j = i+1; j < mas.length; j++) {
                    if(mas[i] > mas[j])
                    {
                        tmp = mas[i];
                        mas[i] = mas[j];
                        mas[j]=tmp;
                        write.write(Arrays.toString(mas)+"\n");
                    }
                }
            }
            write.write(Arrays.toString(mas));
            write.close();
            }
        catch(Exception e)
        {
            System.out.println("This is "+e);

        }

    }
}