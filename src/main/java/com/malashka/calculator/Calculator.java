package main.java.com.malashka.calculator;

import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    public static void main (String[] args) {

        Scanner cons = new Scanner (System.in);
        double x = cons.nextDouble ();
        cons.nextLine ();
        String op = cons.nextLine ();
        double y = cons.nextDouble ();

        switch (op) {

            case "+":
                System.out.println (add (x, y));
                break;
            case "-":
                System.out.println (sub (x, y));
                break;
            case "*":
                System.out.println (mult (x, y));
                break;
            case "/":
                System.out.println (div (x, y));
                break;
            case "^":
                System.out.println (exp (x, y));
                break;
            case "%":
                System.out.println (rem (x, y));
                break;
        }
    }

    public static double add (double x, double y) {
        double result = x + y;
        return result;
    }

    public static double sub (double x, double y) {
        //можно прямо так)
        return x - y;
    }

    public static double mult (double x, double y) {
        double result = x * y;
        //смотри что подсвечивает тебе идея
        return result;
    }

    public static double div (double x, double y) {
        double result = x / y;
        return result;
    }

    public static double exp (double x, double y) {
        double result = Math.pow (x, y);
        return result;
    }

    public static double rem (double x, double y) {
        double result = (int) x % y;
        return result;
    }
}
