package engine;

import lotr.Character;
import lotr.Elf;
import lotr.Hobbit;
import lotr.King;
import lotr.Knight;

import java.util.Random;

public class CharacterFactory {
    static Random random = new Random();

    public Character characterCreator() {
        int randomDecider = random.nextInt(4);

        if (randomDecider == 1) {
            return new Hobbit();
        } if (randomDecider == 2) {
            return new Elf();
        } if (randomDecider == 3) {
            return new Knight();
        } else {
            return new King();
        }
    }
}