package main.sort;

/**
 * Created by JAESANG_MON on 2019-02-17.
 */
public class QuickSort {
    // {69, 10, 30, 2, 16, 8, 31, 22};

    public static int partition(int arr[], int left, int right) {

        int pivot = arr[(left + right) / 2];

        while (left < right) {
            while ((arr[left] < pivot)) left++;
            while ((arr[right] > pivot)) right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                for (int ret : arr) {
                    System.out.print(ret + " ");
                }
            }

            System.out.println();
        }

        return left;
    }


    public static void quickSort(int arr[], int left, int right) {

        if (left >= right)
            return;

        int pivotNewIndex = partition(arr, left, right);
        quickSort(arr, left, pivotNewIndex - 1);
        quickSort(arr, pivotNewIndex + 1, right);


    }

    //
    public static void main(String[] args) {
        int[] arrs = {69, 10, 30, 2, 16, 8, 31, 22};
        System.out.print(" START ");

        for (int ret : arrs) {
            System.out.print(ret + " ");
        }
        System.out.println();
        quickSort(arrs, 0, arrs.length - 1);
        System.out.print(" END ");

        for (int ret : arrs) {
            System.out.print(ret + " ");
        }
    }


}
