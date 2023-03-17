/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

*/

import java.util.LinkedList;

public class Task2<T> {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<Object>();
        list = enqueue(list, 1);
        System.out.println(list);
        list = enqueue(list, 2);
        System.out.println(list);
        list = dequeue(list);
        System.out.println(list);
        Object n = first(list);
        System.out.println(n);

    }


    public static LinkedList<Object> enqueue(LinkedList<Object> inputList, Object obj) {
        LinkedList<Object> outputList = new LinkedList<Object>();
        for (int i = 0; i < inputList.size(); i++) {
            outputList.add(inputList.get(i));
        }
        outputList.add(obj);
        return outputList;
    }
    public static LinkedList<Object> dequeue(LinkedList<Object> inputList) {
        LinkedList<Object> outputList = new LinkedList<Object>();
        for (int i = 0; i < inputList.size(); i++) {
            outputList.add(inputList.get(i));
        }
        System.out.println(outputList.get(0));
        outputList.removeFirst();
        return outputList;
    }
    public static Object first(LinkedList<Object> inputList) {
        System.out.println(inputList.get(0));
        return (Object)(inputList.get(0));
    }

}