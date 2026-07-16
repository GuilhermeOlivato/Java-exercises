package List.src;
import java.util.Scanner;

public class file19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float firstGrade;
        float secondGrade;
        float finalGrade;

        System.out.println("Type the first score:");
        firstGrade = teclado.nextFloat();

        System.out.println("Type the second grade:");
        secondGrade = teclado.nextFloat();

        teclado.close();

        finalGrade = (firstGrade+secondGrade)/2;

        if (finalGrade>7) {
            System.out.println("You've passed the semester with a " + finalGrade +  " score.");
        }else{
            System.out.println("You've failed the semester with a " + finalGrade +  " score.");
        }
    }
}
