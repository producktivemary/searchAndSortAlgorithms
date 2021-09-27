package com.school;

import java.util.Arrays;

/***
 * Mit Lösung vergleichen.
 */

public class Main {

    public static void main(String[] args) {
        int[] zahlenmenge = new int[]{5,1,8,3,9,2};
        System.out.println(Arrays.toString(insertionSort(zahlenmenge)));
	// write your code here
    }

    public static int[] insertionSort(int[] eingabe) {
        for (int i = 1; i < eingabe.length; i++) {
            // zum Zwischenspeichern + vergleichen
            int aktuellesElement = eingabe[i];
            int j = i;
            while (j >= 1) {
                if (eingabe[j-1] >= aktuellesElement) {
                    eingabe[j] = eingabe[j-1];
                    j = j-1;
                } else {
                    break;
                }
            }
            // "behalten" der Zwischenspeicherung
            eingabe[j] = aktuellesElement;
        }
        return eingabe;
    }
}
