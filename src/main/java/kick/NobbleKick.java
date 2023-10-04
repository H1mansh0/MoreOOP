package kick;
import lotr.Character;
import java.util.Random;

public class NobbleKick implements KickStrategy{
    static Random random = new Random();

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        whoKicked.setHp(whoKicked.getHp() - random.nextInt(whoKick.getPower()));
    }
}
