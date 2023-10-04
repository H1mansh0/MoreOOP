import engine.*;
import lotr.Character;

public class Game {

    public static void main(String[] args) {
        GameManager manager = new GameManager();
        CharacterFactory factory = new CharacterFactory();

        Character c1 = factory.characterCreator();
        Character c2 = factory.characterCreator();

        manager.fight(c1, c2);
    }

}
