package org.example;

public class BubbleSort {
// Bubble Sort O(n^2) - Quadratic time complexity
void bubbleSort(int[] array) { // array of integers
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

// method to print array
void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    int n = 5;
    int[] array = {4, 1, 3, 9, 7};

    //instance of the class
    BubbleSort bubbleSort = new BubbleSort();
    System.out.println("Array before sorting:");
    bubbleSort.printArray(array);

    bubbleSort.bubbleSort(array);
    System.out.println("Array after sorting:");
    bubbleSort.printArray(array);
    }
}


