package List.src;
import java.util.Scanner;

public class file21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Type a year:");
        year = scanner.nextInt();
        if (year%4 == 0) {
            System.out.println("The year " + year +  " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
        scanner.close();
    }
}
