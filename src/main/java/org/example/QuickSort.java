package org.example;

public class QuickSort {

    // Main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low  --> Starting index,
    // high  --> Ending index
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at the right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array on the basis of pivot element
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot is the last element
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] with arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {4, 1, 3, 9, 7};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted array (Example 1):");
        printArray(arr1);
    }

    // A utility function to print array of size n
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
