package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(a != 0) {
            double d = (b * b) - (4 * a * c);

            if(d > 0){
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);

                System.out.println(r1 + " " + r2);
            } else if (d == 0) {
                double r = -b / (2.0 * a);
                System.out.println(r);
            } else {
                System.out.println("no roots");
            }
        }
    }
}