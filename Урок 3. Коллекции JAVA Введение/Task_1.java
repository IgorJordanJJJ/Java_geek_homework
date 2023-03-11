/*
 * (Дополнительное) Реализовать алгоритм сортировки слиянием
*/


public class Task_1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 7, 1, 3, 6, 9, 1};
        System.out.println("Before sorting:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[arr.length];
        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = start; x <= end; x++) {
            arr[x] = temp[x];
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}