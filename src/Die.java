import java.util.Random;

public class Die {
    private int eyes;

    public Die () {
        roll();

    }

    public void roll() {
        Random rand = new Random();
        this.eyes = rand.nextInt(6) + 1;
    }

    public int getEyes() {
        return eyes;
    }
}
