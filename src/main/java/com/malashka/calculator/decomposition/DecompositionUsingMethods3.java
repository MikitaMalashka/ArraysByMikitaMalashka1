package main.java.com.malashka.calculator.decomposition;

import java.lang.Math;

public class DecompositionUsingMethods3 {
    public static void main (String[] args) {
        System.out.println ("Площадь правильного треугольника: " + calculateAreaOfTriangle(6));
        System.out.println ("Площадь правильного шестиугольника: " + calculateAreaOfHexagon ());
    }
    public static double calculateAreaOfHexagon (){
        double aoh = calculateAreaOfTriangle (6) * 6;
        return aoh;
    }
    public static double calculateAreaOfTriangle (double a) {
        double aot = Math.pow (a, 2) * Math.sqrt (3) / 4;
        return aot;
    }
}
