package lotr;

import kick.Cry;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3, new Cry());
    }

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        Cry kick = new Cry();
        kick.kick(whoKick, whoKicked);
    }
}
