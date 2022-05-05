package main.java.com.malashka.epamtask.decomposition;

public class DecompositionUsingMethods1 {

    public static void main (String[] args) {
        System.out.println ("НОД: " + findNOD (12, 82));
        System.out.println ("НОК: " + findNOK (12, 82));
    }

    public static int findNOD (int a, int b) {
        int min = a < b ? a : b;
        int nod = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > nod) {
                    nod = i;
                }
            }
        }
        return nod;
    }

    public static int findNOK (int a, int b) {
        int nok;
        nok = a * b / findNOD (a, b);
        return nok;
    }
}
