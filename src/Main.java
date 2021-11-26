import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    int Health = 10;
    public static String name = "";
    static boolean player = true;


    public static void main(String[] args) {
        Menu menu = new Menu();
        Scene scene = new Scene();
        int choice = 0;

        while (player) {
            System.out.println("Hello would you like to play a game");
            System.out.print("If yes press one, if No press two: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    menu.gatherInformation();
                    name = s.next();
                    System.out.println("Great " + name + "lets get going!");
                    scene.sceneOne();
                    choice = s.nextInt();
                    switch (choice){
                        case 1:
                            scene.sceneTwo();
                            choice = s.nextInt();
                            switch (choice) {
                                case 1:
                                    scene.tavernOne();
                                case 2:
                                case 3:

                            }

                        case 2:
                            scene.sceneThree();
                            choice = s.nextInt();
                            switch (choice){
                                case 1:
                                case 2:
                                case 3:
                                    scene.sceneTwo();
                            }
                    }



                case 2:
                    System.out.println("Goodbye");
                    player = false;
//                    System.exit(0);

            }

        }

    }
}
