package List.src;
import java.util.Scanner;

public class SimpleRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNinjas;

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("\nHow many Ninjas will be registered?");
        totalNinjas = scanner.nextInt();

        int option = 0;
        int currentNinjas = 0;
        String[] ninja = new String[totalNinjas];

        while (option !=3) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Add Ninja");
            System.out.println("2. List Ninjas");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    if (currentNinjas < totalNinjas) {
                        System.out.println("Type the Ninja's name:");
                        ninja[currentNinjas] = scanner.nextLine();
                        currentNinjas++;
                    } else {
                        System.out.println("The list is full.");
                    }
                    break;
                case 2:
                    System.out.println("List of Ninjas:");
                    for (int i=0;i<totalNinjas;i++) {
                        System.out.println("1. " + ninja[i]);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Choose a valid option.");
            }
        }
    }
}
