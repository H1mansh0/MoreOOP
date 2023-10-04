package lotr;

import java.util.Random;

public class Knight extends Nobble{

    static Random random = new Random();

    public Knight() {
        super(random.nextInt(10) + 2, random.nextInt(10) + 2);
    }
    
}
