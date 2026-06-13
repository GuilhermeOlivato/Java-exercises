import java.util.Scanner;

public class file9 {
            public static void main(String[] args) {
                double dolar = 0;
                Scanner teclado = new Scanner(System.in);
                teclado.useLocale(java.util.Locale.US);
                System.out.println("Total money in Dolars:");
                dolar = teclado.nextDouble();
                
                double real = dolar * 3;
                System.out.println("You have R$" + real + " in your bank account");



    }
}
