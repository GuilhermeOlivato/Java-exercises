package List.src;
import java.util.Scanner;

public class file20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Type a number:");
        number = scanner.nextInt();
        if (number%2 == 0) {
            System.out.println("The number " + number +  " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
        scanner.close();
    }
}
