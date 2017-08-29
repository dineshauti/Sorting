package com.dineshauti;

public class InsertionSort {

    public int[] sort(int[] arr) {

        int i,j,key,temp;

        for(i=1; i<arr.length; i++) {
            key = arr[i];

            for(j=i-1; j>=0; j--) {

                if (arr[j] > key) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}

