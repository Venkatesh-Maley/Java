class p22_BubbleSort {
        public static void main(String[] args) {
            int arr[] = {20, 30, 10, 40, 60};

            // Display the original array
            System.out.println("Original array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            // Sort in ascending order (Bubble Sort)
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int swap = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = swap;
                    }
                }
            }

            // Display the sorted array
            System.out.println("Sorted array in ascending order:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

    }
}
