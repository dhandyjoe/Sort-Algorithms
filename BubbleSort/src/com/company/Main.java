package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {-22, 10, 0, 8, 5, -49, -30};

        for (int last = intArray.length - 1; last > 0; last--){
            for(int i = 0; i < last; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i +1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap (int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
