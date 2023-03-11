import java.util.ArrayList;
//import java.util.Collections;


/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.*/

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(6);
        
        System.out.println("Весь список: " + list);

        int min = findMinValue(list);
        int max = findMaxValue(list);
        double avg = calculateAverage(list);

        //int min = Collections.min(list);
        //int max = Collections.max(list);
        //double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + avg);
    }
    public static int findMinValue(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
    
    public static int findMaxValue(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
    
    public static double calculateAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double avg = (double) sum / list.size();
        return avg;
    }
}


