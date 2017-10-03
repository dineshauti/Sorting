package com.dineshauti;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {4,9,6,2,1,3,5,8,7,15,10,14,12,11,20,13,19,18,16,17};

        int highIndex = arr.length;
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, highIndex-1);

        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }
}
