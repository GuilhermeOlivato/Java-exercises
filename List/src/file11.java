import java.util.Scanner;

public class file11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Value A: ");
        a = teclado.nextInt();

        System.out.println("Value b: ");
        b = teclado.nextInt();

        System.out.println("Value c: ");
        c = teclado.nextInt();
        double delta = (b * b) - (4 * a * c);
        double positiveX = (-b + Math.sqrt(delta)) / (2*a);
        double negativeX = (-b - Math.sqrt(delta)) / (2*a);
        
        System.out.println("The positive value of X is: " + positiveX);
        System.out.println("The negative value of X is: " + negativeX);
        System.out.println("The value os Delta is: " + delta);
        teclado.close();
    }

}
