package kg.geektech.game.activity.general.players;

import kg.geektech.game.activity.general.RPG_GAME;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
            Random random = new Random();
            boolean rand = random.nextBoolean();
            if (rand) {
                System.out.println(this.getClass().getSimpleName() + " - Use stun ");
                boss.setDamage(0);
        }
    }
}


