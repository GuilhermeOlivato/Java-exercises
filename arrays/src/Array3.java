public class Array3 {

    public static void main(String[] args) {
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println("numero " + i + ": " + numeros[i]);
        }
    }
}
