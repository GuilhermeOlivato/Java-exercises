import java.util.Scanner;


public class file12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double price = 0;
        System.out.println("Type the price of the product: ");
        price = teclado.nextDouble();
        double finalPrice = ((price * 95) /100);
        
        System.out.println("Final price is: " + finalPrice);
        
        teclado.close();
    }
}
