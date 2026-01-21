class p32_InsertionSort {
    public static void main(String[] args) {

        int arr[] = {20, 30, 10, 40, 60};

        // Display the original array
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Insertion Sort Logic
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];   // element to be inserted
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at correct position
            arr[j + 1] = key;
        }

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
