import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner fodase = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            String nome = fodase.nextLine();
            System.out.print("Digite a nota do aluno: ");
            float nota = fodase.nextFloat(); 
            System.out.format("Aluno: %s, Nota: %.1f%n", nome, nota);
        }

    }
}
