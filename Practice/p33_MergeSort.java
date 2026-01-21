class p33_MergeSort {

    // Method to merge two sorted subarrays
    static void merge(int arr[], int left, int mid, int right) {

        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main merge sort method
    static void mergeSort(int arr[], int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int arr[] = {20, 30, 10, 40, 60};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // Call merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
