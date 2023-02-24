package ru.randomArray;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(3, 10)];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 10);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                count = count + 1;
            }
        }
        System.out.println();
        System.out.println("Двоек в массиве " + count);

    }
}
