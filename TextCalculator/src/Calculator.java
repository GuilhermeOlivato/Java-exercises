import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String digit = "";

        System.out.println("Digite um numero após o outro: ");

        while (true){
            digit = scanner.next();

            if (digit.equals("done"))break;

            if (digit.matches("[0-9]")) {
                input = input + digit;
                System.out.println("Current number: " + input);
            } else {
                System.out.println("Error: please type a digit (0-9)!");
            }
        }
        double number = Double.parseDouble(input);
        System.out.println("O numero digitado foi: " + number);





    }

}
