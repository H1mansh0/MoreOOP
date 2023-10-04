package lotr;

import java.util.Random;
import kick.NobbleKick;

public class Nobble extends Character{
    static Random random = new Random();

    public Nobble(int power, int hp) {
        super(power, hp, new NobbleKick());
    }

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        NobbleKick kick = new NobbleKick();
        kick.kick(whoKick, whoKicked);
    }
    
}
