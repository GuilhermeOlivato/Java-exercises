import java.util.Scanner;

public class file13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salary = 0;

        System.out.println("Type your salary: ");
        salary = teclado.nextDouble();
        
        double nextRaise = 0;
        System.out.println("Type your next raise: ");
        nextRaise = teclado.nextDouble();


        double raise = (salary + ((salary*nextRaise)/100));
        
        System.out.println(raise);


    }

}
