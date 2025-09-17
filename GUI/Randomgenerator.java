import java.util.Random;

public class Randomgenerator {
    private int random = -1;
    private Random generator = new Random();

    public Randomgenerator() {
    }

    public void generateRandom() {
        random = generator.nextInt();
    }

    public int getRandom() {
        return random;
    }
}
