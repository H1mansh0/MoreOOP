package lotr;


import kick.ElfsKick;

public class Elf extends Character {

    public Elf() {
        super(10, 10, new ElfsKick());
    }

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        ElfsKick kick = new ElfsKick();
        kick.kick(whoKick, whoKicked);
    }

    

}
