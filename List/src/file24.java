package List.src;
import java.util.Scanner;


public class file24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double finalPrice;
        double totalDistance;

        System.out.println("How many Kilometers will the trip take?");
        totalDistance = scanner.nextDouble();

        if (totalDistance<=200) {
            finalPrice = totalDistance * 0.5;
            System.out.println("The final price for your trip is: " + finalPrice);
        } else {
            finalPrice = totalDistance * 0.45;
            System.out.println("The final price for your trip is: " + finalPrice);
        }
    }
}
