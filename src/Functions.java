import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Functions {
    void gatherInformation() {
        System.out.print("What is your name: ");

    }


    public static void checkHealth(Player player) {
        int health = player.getHealth();
        if (health == 0) {
            System.out.println("you health is " + health);
            gameOver();
        }else {
            System.out.println("Your Heal is " + health);

        }
    }

    public static void gameOver() {
        System.out.print("you are dead\s" +
                "If Would you like to play again press one: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().toLowerCase(Locale.ROOT);
        if (choice.equals("yes")) {
        Main.startOfGame();
            System.exit(0);

        }else{
            System.out.println("GoodBye ");
            System.exit(0);
        }

    }

    public static void combat(Player player, Player monster){
        Random rnd = new Random();
        int d20 = rnd.nextInt(1,20);

        while (player.getHealth() >0 && monster.getHealth() >0){
            if(d20>=monster.getAC()){
                System.out.println("you hit the " + monster.getName() + " for " + player.getDamage());
                monster.setHealth(monster.getHealth()- player.getDamage());
            }
            if(d20>= player.getAC()){
                System.out.println("a " + monster.getName() + "hit you for " + monster.getDamage()+ " your current " +
                        "health is");
                player.setHealth(player.getHealth() - monster.getDamage());
            }
        }

    }

}
