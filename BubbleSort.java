package com.school;

/***
 * Ein Sortier-Algorithmusl. Geht eine Liste mit Zahlen durch, vergleicht Päckchen, und tauscht diese ggf.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Beispiel unsortierter Zahlenmenge
        int[] unsorted = new int[]{1, 8, 3, 44, 2};
        bubblesort(unsorted);
    }

    public static int[] bubblesort(int[] inputArray) {
        // Outer Loop: Läuft, solange der Counter nicht über die Länge der Menge hinausgeht =>
        // geht so oft über den gesamte Array, wie sie Mengen besitzt
        for (int i = 0; i < inputArray.length - 1; i++) {
            // Inner Loop: Tauscht so oft Zahlen im Array, wie sie Mengen besitzt.
            for (int j = 0; j < inputArray.length - 1; j++) { //Comparison size of inner loop =>
                // wenn Wert an 1. Stelle größer als an 2. => tauschen
                if (inputArray[j] > inputArray[j + 1]) {
                    int temporaryStorage = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = temporaryStorage;
                }
            }
        }


        System.out.println(Arrays.toString(inputArray));

        return inputArray;


    }
}
