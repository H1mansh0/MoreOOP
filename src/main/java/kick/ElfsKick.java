package kick;
import lotr.Character;

public class ElfsKick implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character opponent) {
        if(whoKick.power > opponent.power) {
            opponent.setHp(0);
        } else {
            opponent.setPower(opponent.getPower()-1);
        }
    }
}
