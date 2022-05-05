package main.java.com.malashka.calculator.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class OneDimensionalArrays {
    public static void main (String[] args) {

        Scanner cons = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = cons.nextInt();
        int[] a = new int[n];
        int practiceAlgorithmization = 1;
        switch (practiceAlgorithmization) {

    case 1:

        // Найти сумму элементов массива кратных К

        int K = cons.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = cons.nextInt();
            if (a[i] % K == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
        break;

    case 2:

        // Заменить члены, большие Z, этим числом. Посчитать кол-во замен

        int Z = cons.nextInt ();
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = cons.nextInt ();
            if (a[i] > Z) {
                a[i] = Z;
                s++;
            }
            System.out.print (a[i] + " ");
        }
        System.out.println ();
        System.out.println (s);
        break;

    case 3:

        // Посчитать отрицательные, нулевые и положительные элементы массива

        int neg = 0, pos = 0, zer = 0;
        for (int i = 0; i < n; i++) {
            a[i] = cons.nextInt ();
            if (a[i] < 0) {
                neg++;
            }
            if (a[i] > 0) {
                pos++;
            }
            if (a[i] == 0) {
                zer++;
            }
        }
        System.out.println ("Количество отрицательных элементов: " + neg);
        System.out.println ("Количество положительных элементов: " + pos);
        System.out.println ("Количество нулевых элементов: " + zer);

    case 4:

        // Поменять местами наибольший и наименьший члены массива

        a[0] = cons.nextInt ();
        int max = a[0], min = a[0], imax = 0, imin = 0;
        for (int i = 1; i < n; i++) {
            a[i] = cons.nextInt();
            if (a[i] < min) {
                min = a[i];
                imin = i;
            }
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
        }
        int minim = a[imin];
        a[imin] = a[imax];
        a[imax] = minim;
        for (int j = 0; j < n; j++) {
            System.out.print (a[j] + " ");
        }

    case 5:

        // Вывести только те числа, что больше своего порядкового номера

        for (int i = 0; i < n; i++) {
            a[i] = cons.nextInt ();
            if (a[i] > i++) {
                System.out.print (a[i] + " ");
            }
        }

    case 6:

        // Вычислить сумму вещественных чисел, порядковые номера которых являются простыми числами

        double[] b = new double[n];
        double summ = 0;
        for (int i = 0; i < n; i++) {
            b[i] = cons.nextDouble ();
            summ = summ + b[i];
            for (int j = 2; j < i; j++) {
                if ((i + 1) % j == 0) {
                    summ = summ - b[i];
                    break;
                }
            }
        }
        System.out.println (summ);

    case 8:

         // Образовать новый массив, выбросив из предыдущего min значения

        a[0] = cons.nextInt ();
        int c = 1;
        int minimal = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = cons.nextInt ();
            if (a[i] < minimal) {
                minimal = a[i];
                c = 1;
            }
            if (a[i] == minimal) {
                c++;
            }
        }
        int[] m = new int[n - c];
        int i = -1;
        for (int j = 0; j < n - c; ) {
            i++;
            if (a[i] != minimal) {
                m[j] = a[i];
                j++;
            }
            else {
                continue;
            }
        }
        System.out.print (Arrays.toString (m));

    case 9:

        // Найти наиболее часто встречающееся число. Если их несколько, выбрать min

        int[] d = new int [n];
        int[] e = new int [n];
        int r = 0, z = 0, y = 0;
        int maxim = 0, maximind = 0, x = 0, ba = 0;
        for (int j = 0; j < n; j++) {
            a[j] = cons.nextInt ();
            d[j] = a[j];
        }
        for (int j = 0; j < n; j++) {
            for (int l = 0; l < n; l++) {
                if (a[j] == d[l]) {
                r++;
                }
                e[j] = r;
            }
            r = 0;
        }
        for (z = 0; z < n; z++) {
            if (e[z] >= maxim) {
                maxim = e[z];
            }
        }
        for (int j = 0; j < n; j++) {
            if (e[j] == maxim) {
                ba++;
            }
        }
        int[] bb = new int [ba];
        int p = 0;
        for (int j = 0; j < n; j++) {
             if (e[j] == maxim) {
                 bb[p] = a[j];
                 p++;
             }
        }
        Arrays.sort (bb);
        System.out.println ("Минимальное наиболее часто встречающееся число: " + bb[0]);

    case 10:

        // Сжать массив, выбросив каждый второй элемент (освободившиеся элементы заполнить 0)

        for (int j = 0; j < n; j++) {
            a[j] = cons.nextInt ();
        }
        for (int j = 1; j < n; j = j + 2) {
            a[j] = 0;
        }
        System.out.println (Arrays.toString(a));
        }
    }
}

