package com.dineshauti;

public class BubbleSort {

    public int[] sort(int[] arr) {

        int i,j,temp;

        for(i=0; i<arr.length-1; i++) {
           for(j=0; j<arr.length-1-i; j++) { // -i is for the number of items already sorted
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
           }
        }
        return arr;
    }
}
