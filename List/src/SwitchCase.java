package List.src;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose a power");
        System.out.println("1 - Super Strength");
        System.out.println("2 - Super Speed");
        System.out.println("3 - Super Vision");
        int choice;
        boolean isover = false;
        while(!isover){
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("You now have Super Strength");
                    isover = true;
                    break;
                case 2:
                    System.out.println("You now have Super Speed");
                    isover = true;
                    break;
                case 3:
                    System.out.println("You now have Super Vision");
                    isover = true;
                    break;
                default:
                    System.out.println("Choose a valid option");
            }
        }

    }

}
