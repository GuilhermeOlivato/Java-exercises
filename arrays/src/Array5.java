/*import java.util.Scanner;

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
}*/

/*import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numbers;
        boolean isFound = false;
        int totalNumbers;

        System.out.println("how many numbers do you want to enter?");
        totalNumbers = teclado.nextInd();

        for (int i = 0; i < totalNumbers; i++){
            System.out.println("Enter the " + (i+1) + " number");
            numbers[i] = teclado.nextInt();


        }
        for (int c = 0; c < totalNumbers; c++){
            System.out.println(numbers[c]);

        }

    }


} */

import java.util.Scanner;

    public class Array5{
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int totalNumbers = 0;

            System.out.println("how many numbers do you want to enter");
            while (!teclado.hasNextInt()){
                    System.out.println("Invalid input");
                    teclado.nextLine();
            }
            totalNumbers = teclado.nextInt();
                    
            int[] numbers = new int[totalNumbers];
                        
            for(int i=0; i < totalNumbers;i++) {
                System.out.println("Enter the " + (i+1) + " number");
                            while (!teclado.hasNextInt()){

                                teclado.nextLine();
                            }
                            numbers[i] = teclado.nextInt();
                        }
                     for (int c = 0 ; c < totalNumbers ; c++){

                    System.out.println("Number-" + (c+1) + " :" + numbers[c]);   
                    }


        }

    }
