package NLogNSort;

public class NLogNSortTest {

    public void sort(int[] data)
    {
        quicksort(data, 0, data.length -1);
    }

    private static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            // entry data validation
            return;
        }

        int divider = divide(array, left, right, array[right-1]);
        quicksort(array, left, divider - 1);
        quicksort(array, divider, right);
    }

    private static int divide(int[] array, int left, int right, int pivot) {
        //
    }

    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
