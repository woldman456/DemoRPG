import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    int Health = 10;
    public static String name = "";
    static boolean player = true;


    public static void main(String[] args) {
        Menu menu = new Menu();
        int choice = 0;

        while (player) {
            System.out.println("Hello would you like to play a game");
            System.out.print("If yes press one, if No press two: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    menu.mainMenu();
                    name = s.next();

                case 2:
                    player = false;
                    System.exit(0);

            }

        }

    }
}
