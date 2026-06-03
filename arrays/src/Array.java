import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] fruits = {};
        String[] names = {};
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o numero de frutas: ");
            int NumFruits = scanner.nextInt();
            fruits = new int[NumFruits];
            names = new String[NumFruits];
            
            
            // Lendo os nomes e quantidades das frutas
            for (int i = 0; i < fruits.length; i++) {
                System.out.println("Digite o nome da fruta: ");
                String name = scanner.next();
                names[i] = name;
                System.out.println("Digite a quantidade de " + name + ": ");
                int quantity = scanner.nextInt();
                fruits[i] = quantity;
            }
        }
            // Exibindo as frutas e suas quantidades
        System.out.println("Frutas e suas quantidades: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(names[i] + ": " + fruits[i]);
        }
    }

}
