package main.java.com.malashka.epamtask.decomposition;

import java.util.Arrays;

public class DecompositionUsingMethods6 {
    public static void main (String[] args) {
        System.out.println (tellIfAreCoprime (12, 21, 102));
    }
    public static String tellIfAreCoprime (int a, int b, int c) {
        int matrix[] = {a, b, c};
        Arrays.sort (matrix);
        int min = matrix[0];
        int divisorsnumb = 0;
        for (int i = 2; i < min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                divisorsnumb++;
            }
        }
        if (divisorsnumb == 0) {
            String yes = "Числа являются взаимно простыми";
            return yes;
        }
        else {
            String no = "Числа не являются взаимно простыми";
            return no;
        }
    }
}
