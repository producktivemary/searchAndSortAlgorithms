package com.school;

/***
 *  Das Suchen in einer sortierten Menge geht viel schneller: Beispiel in 100 un Zahlen eine Suchen => 50,5.
 *  Vorraussetzung: Zahlen sind nach Größe sortiert.
 */

public class Main {

    public static void main(String[] args) {
        // Menge, die durchsucht werden soll
        int[] menge = {3, 21, 43, 54, 64, 88, 421, 6253};
        // Suchwert, der obv gesucht ist :D
        int suchwert = 64;
        //Printen des Ergebnisses, was meine Methode dabei rausbekommt - also hoffentlich den Suchwert!
        System.out.println(menge[binarySearch(menge, suchwert)]);
    }

    public static int binarySearch(int[] menge, int suchwert) {

        // u = Untergrenze
        int u = 0;
        // o = Obergrenze, natürlich max. Länge, also 8
        int o = menge.length;

        // Läuft, solange die Untergrenze noch nicht die Obergrenze überschritten hat
        while (u < o) {
            // 1. Mal: 4 (ganz normal Hälfte);
            int m = (u +o ) / 2;
            // Ausgangsbedingung => Wenn die bei der Hälfte gefunden Menge dem Suchwert entspricht
            if (menge[m] == suchwert) {
                return m;
                // ansonsten: wenn der Suchwerte sich in der "unteren Hälfte" befindet: obergrenze wird (um 1) verkleinert.
            } else if (suchwert < menge[m]) {
                // Obergrenze zum Suchen wird runterverschoben, wenn der Suchwert kleiner ist als M, um dies einzugrenzen
                o = m - 1;
                // wenn Suchwert sich in "oberer Hälfte" befindet: untergrenze wird (um 1) vergrößert.
            } else {
                u = m +1;
            }
        }
        return -1;
    }
}
