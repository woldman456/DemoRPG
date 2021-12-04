import java.util.Random;

public class Dice {

static Random rd = new Random();

    public static int d20() {
        return rd.nextInt(20) + 1;
    }

    public static int d5() {
        return rd.nextInt(5) +1;
    }


}
