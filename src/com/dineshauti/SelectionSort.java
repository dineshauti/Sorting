package com.dineshauti;

public class SelectionSort {

    public int[] sort(int[] arr) {

        int i,j, temp=0, minValue, minIndex;

        for(i=0; i<arr.length; i++) {
            minValue = arr[i];
            minIndex = i;

            for(j=i; j<arr.length; j++) {
                if(arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            if(minValue < arr[i]) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
