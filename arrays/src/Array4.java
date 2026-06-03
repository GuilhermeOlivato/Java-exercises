import java.util.Scanner;

public class Array4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("How many foods do you want to select?");

        size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];
        
        for(int i = 0; i < foods.length; i++ ){
            System.out.println("Type a food: ");
            foods[i] = scanner.nextLine();
        
        
        }
        
        
        for (String food : foods){
            System.out.println(food);
        }
    }

}
