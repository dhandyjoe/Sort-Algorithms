package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {11, 10, 0, 2};

        for (int i = 1; i < intArray.length; i++) {
            int newELement = intArray[i];
            int k;

            for(k = i; k > 0 && intArray[k - 1] > newELement; k--) {
                intArray[k] = intArray[k - 1];
            }
            intArray[k] = newELement;
        }

        for (int l = 0; l < intArray.length; l++) {
            System.out.println(intArray[l]);
        }
    }
}
