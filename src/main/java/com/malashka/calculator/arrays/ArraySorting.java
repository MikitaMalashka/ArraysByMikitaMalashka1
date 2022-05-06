package com.malashka.calculator.arrays;

import java.util.Scanner;
import java.util.Locale;

public class ArraySorting {
    public static void main (String[] args) {
        Scanner cons = new Scanner (System.in).useLocale (Locale.ENGLISH);
        int sortArrays = 1;
        switch (sortArrays) {

            case 1:

                // Пузырьковая сортировка.

                System.out.println ("Длина одномерного массива: ");
                int n = cons.nextInt ();
                int[] matrix = new int[n];
                System.out.println ("Элементы массива: ");
                for (int i = 0; i < n; i++) {
                    matrix[i] = cons.nextInt ();
                }
                System.out.println ("Массив: ");
                for (int i = 0; i < n; i++) {
                    System.out.print (matrix[i] + "\t");
                }
                System.out.println ();
                System.out.println ("Отсортированный масиив: ");
                for (int i = n - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (matrix[j] > matrix[j + 1]) {
                            int help = matrix[j];
                            matrix[j] = matrix[j + 1];
                            matrix[j + 1] = help;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print (matrix[i] + "\t");
                }
        }
    }
}
