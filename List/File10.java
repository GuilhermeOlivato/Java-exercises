import java.util.Scanner;


public class File10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int height;
        int witdh;

        System.out.println("Type the height: ");
        height = teclado.nextInt();
        
        System.out.println("Type the witdh: ");
        witdh = teclado.nextInt();

        int area = (height * witdh);

        System.out.println("Total area is " + area + "m².");

    }

}
