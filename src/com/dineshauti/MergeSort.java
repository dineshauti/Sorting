package com.dineshauti;

public class MergeSort {


    public int[] sort(int[] arr, int firstIndex, int lastIndex) {
        if(firstIndex < lastIndex) {
            int midIndex = (lastIndex+firstIndex)/2;
            sort(arr, firstIndex, midIndex);
            sort(arr, midIndex+1, lastIndex);
            merge(arr, firstIndex, midIndex, lastIndex);
        }
        return arr;
    }

    private void merge(int[] arr, int firstIndex, int midIndex, int lastIndex) {

        //Left half of the list
        int left[] = new int[midIndex - firstIndex + 2];
        for (int i = firstIndex; i <= midIndex; i++) {
            left[i - firstIndex] = arr[i];
        }
        left[midIndex - firstIndex + 1] = Integer.MAX_VALUE;

        //Right half of the list
        int right[] = new int[lastIndex - midIndex + 1];
        for (int i = midIndex + 1; i <= lastIndex; i++) {
            right[i - midIndex - 1] = arr[i];
        }
        right[lastIndex - midIndex] = Integer.MAX_VALUE;

        int a = 0, b = 0;

        for (int x = firstIndex; x <= lastIndex; x++) {

            if (left[a] <= right[b]) {
                arr[x] = left[a];
                a++;
            }
            else {
                arr[x] = right[b];
                b++;
            }
        }
    }
}
