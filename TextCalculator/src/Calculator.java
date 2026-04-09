import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numero = "";
        String digito;
        System.out.println("Digite um numero de cada vez: ");
        while (true) {
            digito = teclado.next();
            if (digito.equals("done")) break;
            numero = numero + digito;
            System.out.println("numero atual: " + numero);



            int number = (int) Double.parseDouble(numero);
            System.out.println("Numero final: " + number);
        }
    }
}