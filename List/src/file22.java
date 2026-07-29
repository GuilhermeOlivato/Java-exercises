package List.src;
import java.time.Year;
import java.util.Scanner;

public class file22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearInput;
        int currentYear = Year.now().getValue();

        System.out.println(currentYear);
    }
}
