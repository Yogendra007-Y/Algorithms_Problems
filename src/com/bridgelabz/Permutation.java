package com.bridgelabz;
class BubbleSort<T extends Comparable<T>> {
    /**
     * Sort the array
     * @param arr of String
     */
    public void bubbleSort(T arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /**
     * Prints the array
     * @param arr of number
     */
    public void printArray(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "--->");
        System.out.println();
    }
}
class BubbleSortMain {
    public static void main(String args[]) {
        String arr[] = { "xyz", "pqr", "abc", "qwe", "cba" };
        BubbleSort<String> ob = new BubbleSort<String>();
        ob.bubbleSort(arr);
        System.out.print("Sorted array : ");
        ob.printArray(arr);
    }
}

