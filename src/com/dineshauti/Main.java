package com.dineshauti;

public class Main {

    public static void main(String[] args) {

        int arr[] = {4,9,6,2,1};

        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();

        //is.sort(arr);
        ss.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
