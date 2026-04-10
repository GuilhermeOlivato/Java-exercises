import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        int soma = 0;

        System.out.println("Escolha quantas vezes o valor será inserido: ");
        int vezes = teclado.nextInt(); 
        
        for (int c=0; c < vezes; c++) {

            System.out.print("Digite um valor: ");
            valor = teclado.nextInt();
            soma = soma + valor;
            System.out.println("Valor atual da soma: " + soma);
        }
         System.out.println("Foram somados " + vezes + " valores. Sendo a soma total: " + soma);
    teclado.close();
        
    }

    
    

}
