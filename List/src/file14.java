import java.util.Scanner;

public class file14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int travel = 0;
        System.out.println("How many Km will you travel? ");
        travel = teclado.nextInt();

        double fuel = travel * 0,2;
        
        int days = 0;

        System.out.println("For how many days will you rent the car?");
        days = teclado.nextInt();

        double priceDay = days * 90,00;
        

        System.out.println(travel);
        
    }
}
