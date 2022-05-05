package main.java.com.malashka.epamtask.decomposition;

import java.util.Arrays;

public class DecompositionUsingMethods2 {
    public static void main(String[] args) {
        System.out.println ("НОД: " + findNOD (6, 9, 21, 45));
    }
    public static int findNOD(int a, int b, int c, int d) {
        int nod = 0;
        int[] m = {a, b, c, d};
        Arrays.sort (m);
        for (int i = 1; i <= m[0]; i++) {
            if (a % i == 0 && b % i ==0 && c % i == 0 && d % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}