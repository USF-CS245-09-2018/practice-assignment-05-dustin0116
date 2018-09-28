public class MergeSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {
        if(a == null) {
            return;
        }
        if(a.length > 1) {
            int mid = a.length / 2;
            int[] left = new int[mid];
            // Initialize and populate left array
            System.arraycopy(a, 0, left, 0, mid);
            int[] right = new int[a.length-mid];
            // Initialize and populate right array
            if (a.length - mid >= 0) {
                System.arraycopy(a, mid, right, 0, a.length - mid);
            }
            sort(left);
            sort(right);
            //Calls own function to sort both split arrays

            int l = 0; // Index for left array
            int r = 0; // Index for right array
            int ar = 0; // Index for final sorted array
            while(l < left.length && r < right.length) {
                // Merges the left array with the right
                if(left[l] < right[r]) {
                    a[ar] = left[l];
                    l++;
                } else {
                    a[ar] = right[r];
                    r++;
                }
                ar++;
            }
            // Collect elements left in arrays
            while(l < left.length)
            {
                a[ar] = left[l];
                l++;
                ar++;
            }
            while(r < right.length)
            {
                a[ar] = right[r];
                r++;
                ar++;
            }
        }
    }
}
