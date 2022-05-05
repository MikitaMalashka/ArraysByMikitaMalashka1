package main.java.com.malashka.epamtask.arrays;

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int practiceAlgoritmization1 = 14;
        switch (practiceAlgoritmization1) {

            case 1:

                // Вывести все нечетные столбцы матрицы, у которых первый элемент больше последнего

                int[][] matrix = {{2, 6, 5, 3, 5, 6, 6}, {3, 7, 9, 1, 2, 6, 9}, {3, 3, 7, 8, 1, 2, 1}};
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j += 2) {
                        if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                            System.out.print(matrix[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            case 2:

                // Вывести элементы, стоящие на диагонали квадратной матрицы

                System.out.println ("Количество строк и столбцов квадратной матрицы: ");
                int n = cons.nextInt ();
                System.out.println ("Элементы матрицы: ");
                int[][] matr = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matr[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print (matr[i][j] + "\t");
                    }
                    System.out.println ();
                }
                System.out.println ("Элементы, стоящие на диагонали: ");
                for (int i = 0; i < n; i++) {
                    System.out.println(matr[i][i]);
                }

            case 3:

                // Вывести k-ю строку и p-ый столбец матрицы

                System.out.println ("Количество строк: ");
                int m = cons.nextInt ();
                System.out.println ("Количество столбцов: ");
                int n1 = cons.nextInt ();
                int[][] matri = new int[m][n1];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < m; i++){
                    for (int j = 0; j < n1; j++){
                        matri[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print (matri[i][j] + "\t");
                    }
                    System.out.println ();
                }
                System.out.println ("k-ая строка: ");
                int k = cons.nextInt ();
                System.out.println ("p-ый столбец: ");
                int p = cons.nextInt ();
                System.out.println ("Строка: ");
                for (int i = 0; i < n1; i++) {
                    System.out.print(matri[k-1][i] + "\t");
                }
                System.out.println ();
                System.out.println ("Столбец: ");
                for (int i = 0; i < m; i++) {
                    System.out.println (matri[i][p-1]);
                }

            case 4:

                // Сформировать квадратную матрицу порядка n по образцу 1

                System.out.println ("Порядок матрицы: ");
                int n2 = cons.nextInt ();
                int q = 1;
                int[][] mat = new int[n2][n2];
                for (int i = 0; i < n2; i += 2){
                    for (int j = 0; j < n2; j++) {
                        mat[i][j] = q;
                        q++;
                    }
                    q = 1;
                }
                q = n2;
                for (int i = 1; i < n2; i += 2) {
                    for (int j = 0; j < n2; j++){
                        mat[i][j] = q;
                        q--;
                    }
                    q = n2;
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < n2; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print (mat[i][j] + "\t");
                    }
                    System.out.println ();
                }

            case 5:

                // Сформировать квадратную матрицу порядка n по образцу 2

                System.out.println ("Порядок матрицы: ");
                int n3 = cons.nextInt ();
                int w = 1;
                int e = n3;
                int[][] ma = new int[n3][n3];
                for (int i = 0; i < n3; i++) {
                    for (int j = 0; j < e; j++) {
                        ma[i][j] = w;
                    }
                    e--;
                    w++;
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < n3; i++) {
                    for (int j = 0; j < n3; j++) {
                        System.out.print (ma[i][j] + "\t");
                    }
                    System.out.println ();
                }

            case 6:

                // Сформировать квадратную матрицу порядка n по образцу 3

                System.out.println ("Порядок матрицы: ");
                int n4 = cons.nextInt ();
                int left = 0, right = n4 - 1, s = -1;
                int[][] matrixa = new int[n4][n4];
                for (int i = 0; i < n4/2; i++) {
                    for (int j = left; j <= right; j++) {
                        matrixa[i][j] = 1;
                    }
                    left++;
                    right--;
                    s++;
                }
                for (int i = s; i < n4; i++) {
                    for (int j = left; j <= right; j++) {
                        matrixa[i][j] = 1;
                    }
                    left--;
                    right++;
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < n4; i++) {
                    for (int j = 0; j < n4; j++) {
                        System.out.print (matrixa[i][j] + "\t");
                    }
                    System.out.println ();
                }

            case 8:

                // Поменять столбцы матрицы местами

                System.out.println ("Количество строк матрицы: ");
                int str = cons.nextInt ();
                System.out.println ("Количество столбцов матрицы: ");
                int col = cons.nextInt ();
                int[][] matx = new int[str][col];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < str; i++) {
                    for (int j = 0; j < col; j++) {
                        matx[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < str; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(matx[i][j] + "\t");
                    }
                    System.out.println ();
                }
                System.out.println ("Поменять местами столбцы: ");
                int col1 = cons.nextInt ();
                int col2 = cons.nextInt ();
                int[] help = new int[str];
                for (int i = 0; i < str; i++) {
                    help[i] = matx[i][col1 - 1];
                }
                for (int i = 0; i < str; i++) {
                    matx[i][col1 - 1] = matx[i][col2 - 1];
                }
                for (int i = 0; i < str; i++) {
                    matx[i][col2 - 1] = help[i];
                }
                System.out.println ("Замена столбцов в матрице: ");
                for (int i = 0; i < str; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print (matx[i][j] + "\t");
                    }
                    System.out.println ();
                }

            case 9:

                // Посчитать сумму элементов в каждом столбце, определить столбец с максимальной суммой

                System.out.println ("Количество строк матрицы: ");
                int st = cons.nextInt ();
                System.out.println ("Количество столбцов матрицы: ");
                int co = cons.nextInt ();
                int[][] matix = new int[st][co];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < st; i++) {
                    for (int j = 0; j < co; j++) {
                        matix[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < st; i++) {
                    for (int j = 0; j < co; j++) {
                        System.out.print(matix[i][j] + "\t");
                    }
                    System.out.println ();
                }
                int[] sum = new int[co];
                for (int i = 0; i < co; i++) {
                    for (int j = 0; j < st; j++) {
                        sum[i] = sum[i] + matix[j][i];
                    }
                }
                System.out.println ("Сумма элементов в каждом столбце: ");
                for (int i = 0; i < co; i++) {
                    System.out.print (sum[i] + "\t");
                }
                System.out.println ();
                int[] help2 = new int[co];
                for (int i = 0; i < co; i++) {
                    help2[i] = sum[i];
                }
                Arrays.sort(sum);
                System.out.println ("Столбец, содержащий максимальную сумму: ");
                for (int i = 0; i < co; i++) {
                    if (help2[i] == sum[co - 1]) {
                        System.out.println (i + 1);
                    }
                }

            case 10:

                // Найти положительные элементы главной диагонали квадратной матрицы

                System.out.println ("Количество строк и столбцов квадратной матрицы: ");
                int n5 = cons.nextInt ();
                int[][] matrix1 = new int[n5][n5];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < n5; i++) {
                    for (int j = 0; j < n5; j++) {
                        matrix1[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < n5; i++) {
                    for (int j= 0; j < n5; j++) {
                        System.out.print (matrix1[i][j] + "\t");
                    }
                    System.out.println ();
                }
                System.out.println ("Положительные элементы главной диагонали квадратной матрицы: ");
                for (int i = 0; i < n5; i++) {
                    if (matrix1[i][i] > 0) {
                        System.out.print (matrix1[i][i] + "\t");
                    }
                }

            case 11:

                // Матрица 10х20. Значения от 0 до 15. Вывести матрицу
                // и номера строк, где 5 встречается три и более раз

                int[][] matrix2 = new int[10][20];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 20; j++) {
                        matrix2[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 20; j++) {
                        System.out.print (matrix2[i][j] + "\t");
                    }
                    System.out.println ();
                }
                int count5 = 0, countstr = 0;
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (matrix2[i][j] == 5) {
                            count5++;
                            }
                    }
                    if (count5 >= 3) {
                        countstr++;
                    }
                    count5 = 0;
                }
                int i1 = 0;
                int [] help4 = new int [countstr];
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (matrix2[i][j] == 5) {
                            count5++;
                            }
                        }
                    if (count5 >= 3) {
                        help4[i1] = i + 1;
                        i1++;
                    }
                    count5 = 0;
                }
                System.out.println ("Номера строк, где 5 встречается 3 и более раз: ");
                for (int i = 0; i < countstr; i++) {
                    System.out.print (help4[i] + "\t");
                }

            case 12:

                // Отсортировать строки матрицы по возрастанию и убыванию элементов

                System.out.println ("Количество строк матрицы: ");
                int stri = cons.nextInt ();
                System.out.println ("Количество столбцов матрицы: ");
                int colu = cons.nextInt ();
                int[][] matrix3 = new int[stri][colu];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < stri; i++) {
                    for (int j = 0; j < colu; j++) {
                        matrix3[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < stri; i++) {
                    for (int j = 0; j < colu; j++) {
                        System.out.print(matrix3[i][j] + "\t");
                    }
                    System.out.println ();
                }
                for (int i = 0; i < stri; i++) {
                    Arrays.sort(matrix3[i]);
                }
                System.out.println ("Строки в порядке возрастания: ");
                for (int i = 0; i < stri; i++) {
                    for (int j = 0; j < colu; j++) {
                        System.out.print (matrix3[i][j] + "\t");
                    }
                    System.out.println ();
                }
                System.out.println ("Строки в порядке убывания: ");
                for (int i = 0; i < stri; i++) {
                    for (int j = colu - 1; j >= 0; j--) {
                        System.out.print (matrix3[i][j] + "\t");
                    }
                    System.out.println ();
                }

            case 13:

                // Отсортировать столбцы матрицы по возрастанию и убыванию элементов

                System.out.println ("Количество строк матрицы: ");
                int strin = cons.nextInt ();
                System.out.println ("Количество столбцов матрицы: ");
                int colum = cons.nextInt ();
                int[][] matrix4 = new int[strin][colum];
                int[][] helpmat = new int[colum][strin];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < strin; i++) {
                    for (int j = 0; j < colum; j++) {
                        matrix4[i][j] = cons.nextInt ();
                        helpmat[j][i] = matrix4[i][j];
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < strin; i++) {
                    for (int j = 0; j < colum; j++) {
                        System.out.print(matrix4[i][j] + "\t");
                    }
                    System.out.println ();
                }
                for (int i = 0; i < colum; i++) {
                    Arrays.sort (helpmat[i]);
                }
                for (int i = 0; i < strin; i++) {
                    for (int j = 0; j < colum; j++) {
                        matrix4[i][j] = helpmat[j][i];
                    }
                }
                System.out.println ("Столбцы в порядке возрастания: ");
                for (int i = 0; i < strin; i++) {
                    for (int j = 0; j < colum; j++) {
                        System.out.print (matrix4[i][j] + "\t");
                    }
                    System.out.println ();
                }
                int counter = strin - 1;
                for (int i = 0; i < strin; i++) {
                    for (int j = 0; j < colum; j++) {
                        matrix4[i][j] = helpmat[j][counter];
                    }
                    counter--;
                }
                System.out.println ("Столбцы в порядке убывания: ");
                for (int i = 0; i < strin; i++) {
                    for (int j = 0; j < colum; j++) {
                        System.out.print (matrix4[i][j] + "\t");
                    }
                    System.out.println ();
                }

            case 15:

                // Найти наибольший элемент матрицы и заменить все нечетные элементы на него

                System.out.println ("Количество строк матрицы: ");
                int strings = cons.nextInt ();
                System.out.println ("Количество столбцов матрицы: ");
                int columns = cons.nextInt ();
                int[][] matrix5 = new int[strings][columns];
                System.out.println ("Элементы матрицы: ");
                for (int i = 0; i < strings; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix5[i][j] = cons.nextInt ();
                    }
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < strings; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print (matrix5[i][j] + "\t");
                    }
                    System.out.println ();
                }
                int maxi = 0;
                for (int i = 0; i < strings; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (matrix5[i][j] > maxi) {
                            maxi = matrix5[i][j];
                        }
                    }
                }
                System.out.println ("Наибольший элемент матрицы: " + maxi);
                for (int i = 0; i < strings; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (matrix5[i][j] % 2 != 0) {
                            matrix5[i][j] = maxi;
                        }
                    }
                }
                System.out.println ("Отредактированная матрица: ");
                for (int i = 0; i < strings; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print (matrix5[i][j] + "\t");
                    }
                    System.out.println ();
                }

            case 14:

                // Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
                // причем в каждом столбце число единиц равно номеру столбца

                System.out.println ("Количество строк матрицы: ");
                int sm = cons.nextInt ();
                System.out.println ("Количество столбцов матрицы: ");
                int cn = cons.nextInt ();
                int[][] matrix6 = new int[sm][cn];
                int sumc = 0;
                Random rnd = new Random ();
                for (int i = 0; i < cn; i++) {
                    while (sumc != i + 1) {
                        int j = rnd.nextInt(sm);
                        if (matrix6[j][i] == 0) {
                            matrix6[j][i] = 1;
                            sumc = sumc + matrix6[j][i];
                        }
                    }
                    sumc = 0;
                }
                System.out.println ("Матрица: ");
                for (int i = 0; i < sm; i++) {
                    for (int j = 0; j < cn; j++) {
                        System.out.print (matrix6[i][j] + "\t");
                    }
                    System.out.println ();
                }
        }
    }
}


