import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalNumbers = 0;
        
        System.out.println("how many numbers do you want to enter?");
        while(true){
            try{
                totalNumbers = teclado.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Invalid input, numbers only.");
                teclado.nextLine();

            }
        }
            int[] numbers = new int[totalNumbers];
        
        

        for (int i = 0; i < totalNumbers; i++){
            System.out.println("Enter the " + (i+1) + " number");
            while(true){
                try {
                    numbers[i] = teclado.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input, numbers only.");
                    teclado.nextLine();
                }
            }
        }
        System.out.print("The numbers are: ");

        for (int c = 0; c < totalNumbers; c++){
            if(c < totalNumbers - 1){
                System.out.print(numbers[c] + ", ");
            }
            else{
                    System.out.print(numbers[c] + ".");
            }
        }
    }
}