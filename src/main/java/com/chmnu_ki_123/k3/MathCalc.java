package com.chmnu_ki_123.k3;

import static java.lang.Math.*;

public class MathCalc {
    public static void main(String[] args) {
        double x = -0.3, a = 0.1, b = 3, c = -2.25;

        double one = a*cos(b / (x * x - 1));
        double two = exp(-b * x) + c;
        double result = one / two;

        System.out.printf("Result: %.3f\n", result);
    }
}
