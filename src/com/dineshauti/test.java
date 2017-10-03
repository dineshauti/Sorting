package com.dineshauti;

import java.util.Arrays;
import java.util.Collections;

public class test {

    public static void main(String[] args) {

        int numberArray[] = new int[4];

        for(int i=0; i<numberArray.length; i++) {
            numberArray[i] = i;
        }

/*        for(int i=0; i<numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }*/

        for (int number: numberArray) {
            System.out.print(number + " ");
        }

        Collections.reverse(Arrays.asList(numberArray));
        System.out.println();

        for (int number: numberArray) {
            System.out.print(number + " ");
        }
    }

}
