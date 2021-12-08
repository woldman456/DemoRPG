import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    static int health = 10;
    static Weapon club= new Weapon("club", 3, "bashing");
    static Weapon sword = new Weapon("rusty sword", 5, "slashing");
    static Player player = new Player(health, null, 15, sword);
    static Player goblin = new Player(5, "goblin", 10, sword);
    static Functions functions = new Functions();
    static Scene scene = new Scene();
    static Coins gold = new Coins("gold");
    static Coins copper = new Coins("copper");



    public static void main(String[] args) {
        Functions.loot(sword.getName());
        copper.setAmount(4);
        Functions.loot(copper.getName());
        functions.gatherInformation();
        startOfGame();

    }

    public static void startOfGame() {
        player.setHealth(10);

        try {

            int choice = 0;

            System.out.println("Hello " + player.getName() + " would you like to play a game");
            System.out.print("If yes press one, if No press two: ");

            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Great " + player.getName() + " lets get going!");

                    scene.sceneOne();
                    choice = s.nextInt();
                    switch (choice) {
                        case 1:
                            scene.sceneTwo();
                            choice = s.nextInt();
                            switch (choice) {
                                case 1 -> {
                                    scene.tavernOne(player);
                                    choice = s.nextInt();
                                    switch (choice) {
                                        case 1 -> {
                                            scene.run(goblin);
                                            choice = s.nextInt();
                                            switch (choice) {
                                                case 1:
                                                    scene.longRoadOne();

                                                case 2:
                                                    scene.sceneThree();
                                            }

                                        }
                                        case 2 -> {
                                            scene.tavernFight(player, goblin);
                                            choice = s.nextInt();
                                            switch (choice){
                                                case 1:
                                                    scene.tavernSearch();
                                                case 2:
                                                    scene.tavernLooting();
                                            }

                                        }
                                    }

                                }
                                case 2 -> {
                                    scene.tavernTwo();

                                }
                                case 3 -> {
                                    scene.longRoadOne();

                                }
                            }

                        case 2:
                            scene.sceneThree();
                            choice = s.nextInt();
                            switch (choice) {
                                case 1 -> {
                                    scene.roadOne();

                                }
                                case 2 -> {
                                    scene.roadTwo();

                                }
                                case 3 -> {
                                    scene.sceneTwo();

                                }
                            }
                    }


                case 2:
                    System.out.println("Goodbye");
                    System.exit(0);

            }

        } catch (Exception e) {
            System.out.println("invalid input please try again: ");
        }
    }
}

