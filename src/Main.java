import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
            }
        }





    }
}