package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double sumS = p / 2;
        double x = sumS / (1 + k);
        return x * (x * k);
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}

