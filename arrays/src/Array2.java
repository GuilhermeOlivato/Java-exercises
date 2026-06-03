import java.lang.reflect.Array;

public class Array2 {

    public static void main(String[] args) {
        int numeroFrutas;
        int arraysize = new String[numeroFrutas];
        String [] frutas = {arraysize};

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de frutas: ");
        numeroFrutas = teclado.nextInt();
        
        frutas = new String[numeroFrutas];
        int length = Array.getLength(frutas);
        System.out.println(length);
        teclado.close();    
    }

}
