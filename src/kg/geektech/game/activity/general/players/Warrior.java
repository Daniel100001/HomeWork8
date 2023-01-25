package kg.geektech.game.activity.general.players;

import kg.geektech.game.activity.general.RPG_GAME;

import java.util.Random;

public class Warrior extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        if (boss.getHealth() > 0){
            int rand = RPG_GAME.random.nextInt(4) + 2;
            boss.setHealth(boss.getHealth() - this.getDamage() * rand);
            System.out.println("Warrior use - Critical damage " + this.getDamage() * rand);
        }
    }
}
