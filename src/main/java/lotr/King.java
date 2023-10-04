package lotr;
import java.util.Random;

public class King extends Nobble{
    static Random random = new Random();

    public King() {
        super(random.nextInt(10) + 5, random.nextInt(10) + 5);
    }
    

}
