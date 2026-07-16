package List.src;
import java.util.Scanner;


public class file18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int age;
        int date;
        int currentDate = 2026;
        System.out.println("Type your date of birth:");
        date = teclado.nextInt();
        age = (currentDate - date);
        if (age>60 || (age>=16 && age<18)){
            System.out.println("You can vote if You want.");

        } else if (age>=18 && age<60) {
            System.out.println("You have to vote.");
        }   else if (age<16) {
                System.out.println("You can't vote.");
        }
    }
}
