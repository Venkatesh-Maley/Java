class p34_QuickSort {

    // Method to partition the array
    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];   // choose last element as pivot
        int i = low - 1;         // index of smaller element

        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;   // pivot index
    }

    // Quick sort method
    static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            // Sort left side
            quickSort(arr, low, pi - 1);

            // Sort right side
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {20, 30, 10, 40, 60};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // Call quick sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
