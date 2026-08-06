package List.src;

import java.util.Scanner;

public class NinjaMain {

    static Scanner scanner = new Scanner(System.in);

    private static final int NINJA_LIMIT = 20;

    public static void main(String[] args) {
        int option = 0;
        int totalUchihas = 0;
        int totalSenju = 0;
        Senju[] ninjasSenju = new Senju[NINJA_LIMIT];



        do {

            showMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("List ninjas");
                    break;
                case 2:
//        Add ninjas
                    System.out.println("Add ninjas");
                    break;
                case 3:
                    System.out.println("Edit ninja");
//        Edit ninjas
                    break;
                case 4:
                    System.out.println("Remove ninjas");
//        Remove ninjas
                    break;
                case 5:
                    System.out.println("List jutsus");
//        List jutsus
                    break;
                case 6:
                    System.out.println("List quests");
//        List quests
                    break;
                case 7:
                    System.out.println("Exiting");
//        Leave program
                    break;


                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 7);

    }

    private static void showMenu() {
        System.out.println("\n===============================");
        System.out.println("       MENU DA ALDEIA");
        System.out.println("===============================");
        System.out.println("1 - List Ninjas");
        System.out.println("2 - Add Ninja");
        System.out.println("3 - Edit Ninja");
        System.out.println("4 - Remove Ninja");
        System.out.println("5 - List Jutsus");
        System.out.println("6 - List Quests");
        System.out.println("7 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    private static void listNinjas(){}
    private static void editNinjas(){}
    private static void removeNinjas(){}
    private static void listJutsus(){}
    private static void listQuests(){}
}
