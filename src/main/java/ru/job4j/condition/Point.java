package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int a1 = x2 - x1;
        int a2 = y2 - y1;
        double first = Math.pow(a1, 2);
        double second = Math.pow(a2, 2);
        double result = first + second;
        return Math.sqrt(result);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}