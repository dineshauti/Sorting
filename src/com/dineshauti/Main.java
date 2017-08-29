package com.dineshauti;

public class Main {

    public static void main(String[] args) {

        int arr[] = {4,9,6,2,1};

        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();
        BubbleSort bs = new BubbleSort();

        //is.sort(arr); 
        //ss.sort(arr);
        bs.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
