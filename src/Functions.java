import java.util.Locale;
import java.util.Scanner;

public class Functions {
    void gatherInformation() {
        System.out.println("What is your name");
        System.out.print("Enter Name: ");
    }


    public static void checkHealth(Player player) {
        int health = player.getHealth();
        if (health == 0) {
            System.out.println("you health is " + health);
        }
        System.out.println("Your Heal is " + health);


    }

    public static void gameOver() {
        System.out.print("you are dead\s" +
                "Would you like to play again: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().toLowerCase(Locale.ROOT);
        if (choice.equals("yes")) {
        Main.startOfGame();

        }else{
            System.out.println("GoodBye ");
            System.exit(0);
        }

    }

}
