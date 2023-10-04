package engine;

import lotr.Character;

public class GameManager {

    public void fight(Character c1, Character c2) {

        String name1 = c1.getClass().getSimpleName();
        String name2 = c2.getClass().getSimpleName();

        System.out.println(name1 + " {" + c1.getHp() + "}" + " and " +  name2 + " {" + c2.getHp() + "}" + " enter the battle");

        while(c1.isAlive() && c2.isAlive()) {

            if(c1.getClass().getSimpleName() == c2.getClass().getSimpleName()) {
                String checker = c1.getClass().getSimpleName();
                if (checker.equals("Hobbit") || checker.equals("Elf")) {
                    System.out.println(checker+"s can not kill each other🥺");
                    break;
                }
            }

            int hp1 = c1.getHp();
            int hp2 = c2.getHp();

            System.out.println(name1 + " is attacking");

            c1.kick(c2);

            int damage1 = hp2 - c2.getHp();
            System.out.println(name2 + " gets " + damage1 + " amount of damage" + " and left with " + c2.getHp());

            if (!c2.isAlive()) {
                break;
            }

            System.out.println(name2 + " is attacking");

            c2.kick(c1);

            int damage2 = hp1 - c1.getHp();
            System.out.println(name1 + " gets " + damage2 + " amount of damage" + " and left with " + c1.getHp());
        }

        String winner;
        if (c1.isAlive()) {
            winner = c1.getClass().getSimpleName();
        } else {
            winner = c2.getClass().getSimpleName();
        }

        System.out.println("The game is finished and the winner is: " + winner);
    }
}
