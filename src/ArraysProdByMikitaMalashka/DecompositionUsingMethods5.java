package ArraysProdByMikitaMalashka;

public class DecompositionUsingMethods5 {
    public static int[] matrix = {2, 5, 3, 8, 5, 9};
    public static void main (String[] args) {
        System.out.println ("Матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print (matrix[i] + "\t");
        }
        System.out.println ();
        System.out.println ("Второе максимальное число: " + findSecondMax ());
    }
    public static int findFirstMax () {
        int firstmax = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > firstmax) {
                firstmax = matrix[i];
            }
        }
        return firstmax;
    }
    public static int findSecondMax () {
        int secmax = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > secmax && matrix[i] < findFirstMax ()) {
                secmax = matrix[i];
            }
        }
        return secmax;
    }
}
