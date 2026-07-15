package List.src;
import java.util.Scanner;


public class file17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int speed;
        System.out.println("Type the car's speed:");
        speed = teclado.nextInt();
        teclado.close();

        if (speed > 80) {
            int extra = speed - 80;
            int fine = extra * 5;
            System.out.println("You're over the speed limit and have to pay $" + fine + " in fines.");
        } else {
            System.out.println("You're under the speed limit, good boy.");
        }
    }
}
