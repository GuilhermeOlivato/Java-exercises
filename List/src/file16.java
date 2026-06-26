import java.util.Scanner;


public class file16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int days;
        int years;

        System.out.println("How many cigarettes do you smoke per day? ");
        days = teclado.nextInt();
        
        System.out.println("For how many years have you been smoking? ");
        years = teclado.nextInt();

        int totalCigs = days * years * 365;
        System.out.println("You have smoked " + totalCigs + " cigarettes in your life.");

        int lifeReduction = totalCigs/144;
        System.out.println("You have lost " + lifeReduction + " days of your life.");
        System.out.println(lifeReduction); 
        teclado.close();
    }
}
