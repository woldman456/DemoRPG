import java.util.Random;

public class Dice {

static Random rd = new Random();

    public static int d20() {
        return rd.nextInt(20) + 1;
    }

    public static int attack(int maxDamage) {
        return rd.nextInt(maxDamage) +1;
    }


}
