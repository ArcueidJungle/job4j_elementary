package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float inDollar = 120;
        float dollarExpected = 2;
        float euroExpected = 2;
        float euro = Converter.rubleToEuro(in);
        float dollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = dollarExpected == dollar;
        boolean passedEuro = euroExpected == euro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
    }
}

