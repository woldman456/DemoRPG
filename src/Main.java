import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    static boolean play = true;
    static int health = 10;
    static String name = "";
    static Random rnd = new Random();
    static int d20 = rnd.nextInt(1,20);
    static int d5 = new Random().nextInt(1,5);
    static Weapon sword = new Weapon("rusty sword", d5);
    static Player player = new Player(health, name, 15, sword);
    static Player goblin = new Player(5, "goblin", 10, sword);
    static Functions functions = new Functions();
    static Scene scene = new Scene();


    public static void main(String[] args) {
        functions.gatherInformation();
        name = s.next();
        startOfGame();
    }

    public static void startOfGame() {
        player.setHealth(10);


        int choice = 0;




            System.out.println("Hello would you like to play a game");
            System.out.print("If yes press one, if No press two: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Great " + name + "lets get going!");
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
                                            scene.run();

                                        }
                                        case 2 -> {
                                            scene.tavernFight(player, goblin);

                                        }
                                    }

                                }
                                case 2 -> {
                                    scene.tavernTwo();

                                }
                                case 3 -> {
                                    scene.tavernThree();

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
                    play = false;
                    System.exit(0);

            }

        }

    }

