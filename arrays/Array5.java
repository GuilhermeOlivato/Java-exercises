import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numbers = {1, 7, 5, 9, 3};
        boolean isFound = false;
        int target = 0;

        System.out.println("Enter a number between 1 and 10");
        target = teclado.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Number not found in the array.");
        }
    }
}