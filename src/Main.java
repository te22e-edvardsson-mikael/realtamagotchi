import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your tamagotchi name: ");
        String name = scanner.nextLine();

        Tamagotchi tamagotchi = new Tamagotchi(name);

        while (tamagotchi.getAlive()){
            System.out.println("what would you like to do?");
            System.out.println("1. Feed your tamagotchi");
            System.out.println("2. Teach your tamagotchi");
            System.out.println("3. print your tamagotchi's stats");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tamagotchi.feed();
                    break;
                    case 2:
                        System.out.println("Enter a word to teach your tamagotchi: ");
                        String word = scanner.nextLine();
                        tamagotchi.teach(word);
                        break;
                        case 3:
                            tamagotchi.printstats();
                            break;
                case 4:
                    System.out.println("goodbye");
                    System.exit(0);
                case 5:
                    System.out.println();

                default:
                    System.out.println("invalid choice. Please try again.");
            }
            tamagotchi.tick();
        }

        System.out.println("Your Tamagotchi has died");





    }
}