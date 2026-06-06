import java.util.Scanner;

public class Array7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("How many foods do you want to select? Hein, imbecil? ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i=0; i<foods.length; i++){
            System.out.println("Type a fruit: ");
            foods[i] = scanner.nextLine();

        }
        
        for (String food : foods){
            
            System.out.println("Fruta ", food);
        }
    }
}
