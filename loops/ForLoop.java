import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        int soma = 0;

         for (int c=0; c < 10; c++) {

            System.out.print("Digite um valor: ");
            valor = teclado.nextInt();
            soma = soma + valor;
            System.out.println("Valor atual da soma: " + soma);

         }


    }

}
