import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    static boolean play = true;
    static String name = "";
    static Player player = new Player(10, name);
    static Functions functions = new Functions();
    static Scene scene = new Scene();


    public static void main(String[] args) {
        startOfGame();
    }

    public static void startOfGame() {
        functions.gatherInformation();
        String name = s.next();

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
                                case 1:
                                    scene.tavernOne(player);
                                case 2:
                                    scene.tavernTwo();
                                case 3:
                                    scene.tavernThree();

                            }

                        case 2:
                            scene.sceneThree();
                            choice = s.nextInt();
                            switch (choice) {
                                case 1:
                                    scene.roadOne();
                                case 2:
                                    scene.roadTwo();
                                case 3:
                                    scene.sceneTwo();
                            }
                    }


                case 2:
                    System.out.println("Goodbye");
                    play = false;
                    System.exit(0);

            }

        }
        Functions.gameOver();

    }
}
