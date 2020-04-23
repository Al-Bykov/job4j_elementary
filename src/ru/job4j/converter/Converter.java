package ru.job4j.converter;

/**
 * Конвертер рублей в евро и доллары по заданному курсу
 * @author Aleksandr Bykov
 */

public class Converter {

    /**
     * Method rubleToEuro.
     * @param value Original amount in rubles.
     * @return Received amount in euros.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Method rubleToDollar.
     * @param value Original amount in rubles.
     * @return Received amount in dollars.
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main.
     * @param args - args.
     */

    public static void main(String[] args) {

        int euro = Converter.rubleToEuro(140);
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;

        int dollar = Converter.rubleToDollar(180);
        int inD = 180;
        int expectedD = 3;
        int outD = rubleToDollar(inD);
        boolean passedD = expectedD == outD;

        System.out.println("140 rubles are " + euro + " euro. " + "Test result: " + passed);
        System.out.println("180 rubles are " + dollar + " dollar. " + "Test result: " + passedD);
    }
}