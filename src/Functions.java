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


        while (player.getHealth() >0 && monster.getHealth() >0){
            Random rnd = new Random();
            int pd20 = Dice.d20();
            int pDamage = rnd.nextInt(player.getWeapon().getDamageMax())+1;
            if(pd20 >=monster.getAC()){

                System.out.println("you do " + pDamage + " of " + player.getWeapon().getDamageType() + " damage " +
                        " to a " + monster.getName());
                monster.setHealth(monster.getHealth()- pDamage);
            }else {
                System.out.println("you missed a " + monster.getName());
            }
            int md20 = Dice.d20();
            if(md20 >= player.getAC()){
                int mDamage = rnd.nextInt(monster.getWeapon().getDamageMax())+1;
                System.out.println("a " + monster.getName() + " does " + mDamage + "worth of " +
                        monster.getWeapon().getDamageType() + " to you. Your current health is " +
                        player.getHealth());
                player.setHealth(player.getHealth() - mDamage);
            }else {
                System.out.println("You dodged a strike from a " + monster.getName());
            }
        }

    }

}
