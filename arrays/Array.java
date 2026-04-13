import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] fruits = {};
        String[] names = {};
        names = new String[NumFruits]; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de frutas: ");
        int NumFruits = teclado.nextInt();
        fruits = new int[NumFruits];
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Digite o nome da fruta: ");
            String name = teclado.next();
            names[i] = name;
            System.out.println("Digite a quantidade de " + name + ": ");
            int quantity = teclado.nextInt();
            fruits[i] = quantity;
        }   
        System.out.println("Frutas e suas quantidades: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(names[i] + " " + (i + 1) + ": " + fruits[i]);
        }
    }

}
