public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i-1;
            // Set j as the previous index to compare.
            while(j >= 0 && a[j] > temp) {
                a[j+1] = a[j];
                --j; // Decrement j so that it compares with all previous elements and swap if needed.
            }
            a[j+1] = temp;
        }
    }
}