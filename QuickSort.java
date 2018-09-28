public class QuickSort implements SortingAlgorithm {
    int partition(int a[], int low, int high) {
        int pivot = a[high];
        // Takes last element as pivot and put it where appropriate
        int i = (low-1); // Index of smaller element
        for (int j=low; j<=high-1; j++) {
            // Comparing current element to pivot
            if (pivot >= a[j]) {
                i++;
                //Swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // Swap with pivot
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        return i+1;
    }

    void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            // Sort elements before and after partitions recursively
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }

    @Override
    public void sort(int[] a) {
        int low = 0;
        int high = a.length-1;
        quickSort(a, low, high);
    }
}
