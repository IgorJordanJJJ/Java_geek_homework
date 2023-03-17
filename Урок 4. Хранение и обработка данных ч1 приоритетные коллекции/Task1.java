/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
*/
/**
 * Task1
 */

 import java.util.LinkedList;

public class Task1 {

    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        LinkedList<Integer> outputList = flipList(inputList);
        System.out.println(outputList); // Output: [3, 2, 1]
    }


    public static LinkedList<Integer> flipList(LinkedList<Integer> inputList) {
        LinkedList<Integer> outputList = new LinkedList<Integer>();
        for (int i = inputList.size() - 1; i >= 0; i--) {
            outputList.add(inputList.get(i));
        }
        return outputList;
    }
}