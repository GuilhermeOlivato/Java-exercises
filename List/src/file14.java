import java.util.Scanner;

public class file14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double travel = 0;
        System.out.println("How many Km will you travel? ");
        travel = teclado.nextDouble();

        
        double days = 0;
        
        System.out.println("For how many days will you rent the car?");
        days = teclado.nextDouble();
        
        double priceDay = days * 90;
        double fuelPrice = (travel * 20)/100;
        

        System.out.println((travel) + " - " + (priceDay) + " - " + (days) + " - " + (fuelPrice));
        System.out.println(fuelPrice);
        

        
    }
}
