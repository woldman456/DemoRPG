import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    static boolean play = true;
    static int health = 10;
    static String name = "";
    static Player player = new Player(health, name);
    static Functions functions = new Functions();
    static Scene scene = new Scene();


    public static void main(String[] args) {
        functions.gatherInformation();
        name = s.next();
        startOfGame();
    }

    public static void startOfGame() {


        int choice = 0;


        while (play || player.getHealth() > 0) {

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
                                    System.exit(0);
                                    choice = s.nextInt();
                                    switch (choice){
                                        case 1:
                                        scene.run();
                                        case 2:
                                            scene.tavernFight();
                                    }

                                }
                                case 2 -> {
                                    scene.tavernTwo();
                                    System.exit(0);
                                }
                                case 3 -> {
                                    scene.tavernThree();
                                    System.exit(0);
                                }
                            }

                        case 2:
                            scene.sceneThree();
                            choice = s.nextInt();
                            switch (choice) {
                                case 1 -> {
                                    scene.roadOne();
                                    System.exit(0);
                                }
                                case 2 -> {
                                    scene.roadTwo();
                                    System.exit(0);
                                }
                                case 3 -> {
                                    scene.sceneTwo();
                                    System.exit(0);
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
}
