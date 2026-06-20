import java.util.Scanner;



public class file15 {
    public static void main(String[] args) {
        int days;
        Scanner teclado = new Scanner(System.in);
        System.out.println("How many days a month do You work? ");
        days = teclado.nextInt();
        

        int hours;
        System.out.println("How many hours per day do you work? ");
        hours = teclado.nextInt();

        int rate;
        System.out.println("What's your hourly rate? ");
        rate = teclado.nextInt();

        int salary = days * hours * rate ;

        System.out.println("Your monthly salary is " + salary + " dolars per month.");
        



    }
}
