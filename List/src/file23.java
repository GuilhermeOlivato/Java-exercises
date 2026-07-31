package List.src;
import java.util.Scanner;

public class file23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double price;
        double totalPrice;
        int isFemale;
        double discount = 0;


        System.out.println("Type '1' if you are a male and '2' if you are a female.");
        isFemale = scanner.nextInt();
        scanner.nextLine();

        if (isFemale == 1) {
            discount = 5;
        } else if (isFemale == 2) {
            discount = 13;
        } else System.out.println("Invalid answer, please try again.");

        System.out.println("Type your name:");
        name = scanner.nextLine();
        System.out.println("Type your age:");
        age = scanner.nextInt();
        System.out.println("Type the total before discount:");
        price = scanner.nextDouble();

        totalPrice = price - ((discount/100) * price);


        System.out.println(name + ", " + "the total price after discount is: $" + totalPrice +".");



    }
}
