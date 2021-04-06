package com.company;

public class Main {

    /*

    3 * rekursif
    3 * 2 (num) * rekursif
    3 * 2 * 1 * rekurrsi
    3 * 2 * 1 * 1

    */


    public static void main(String[] args) {
        System.out.println(rekursif(5));
    }

    public static int rekursif(int num) {
        if (num == 0) {
            return 1;
        }
        return num * rekursif(num - 1);

    }

    public static int iterativeFactorial (int num) {
        int faktorial = 1;

        if(num == 0) {
            return 1;
        } else  {
            for (int i = faktorial; i <= num; i++){
                faktorial *= i;
            }
        }
        return faktorial;
    }
}
