package main.java.com.malashka.epamtask.decomposition;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class DecompositionUsingMethods10 {
    public static void main (String[] args) {
        System.out.println ("Число представленное в виде матрицы: " + Arrays.toString (representAsMatrix ()));
    }
    public static int[] representAsMatrix () {
        System.out.println ("Число: ");
        Scanner cons = new Scanner (System.in);
        String n = cons.nextLine ();
        int numb = n.length ();
        int nToInt = Integer.parseInt (n);
        int[] matrix = new int[numb];
        int j = numb - 1;
        for (int i = 0; i < numb; i++) {
            matrix[j] = nToInt % (int) Math.pow (10, i + 1) / (int) Math.pow (10, i) ;
            j--;
        }
        return matrix;
    }
}
