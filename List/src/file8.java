package List.src;

import java.util.Scanner;

public class file8 {
    public static void main(String[] args) {
        double meters;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Type the quantity of meters: ");
        meters = teclado.nextDouble();

        double kilometer = meters/1000;
        double hectometer = meters/100;
        double decameter = meters/10;
        double decimeter = meters*10;
        double centimeter = meters*100;
        double millimeter = meters*1000;

        System.out.println(meters + "meters is the equivalent to: ");

        System.out.println(kilometer + " Kilometers.");
        System.out.println("------------------");
        System.out.println(hectometer + "Hectometers.");
        System.out.println("------------------");
        System.out.println(decameter + "Decameters.");
        System.out.println("------------------");
        System.out.println(decimeter + "Decimeters.");
        System.out.println("------------------");
        System.out.println(centimeter + "Centimeters.");
        System.out.println("------------------");
        System.out.println(millimeter + "Millimeters.");
        System.out.println("------------------");
        System.out.println("Done.");

    }
}