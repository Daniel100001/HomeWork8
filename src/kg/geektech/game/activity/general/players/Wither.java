package kg.geektech.game.activity.general.players;

import kg.geektech.game.activity.general.RPG_GAME;

import java.util.Random;

public class Wither extends Hero{

    public Wither(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.REJOICE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if(hero[i].getHealth() == 0 && this != hero[i]){
                hero[i].setHealth(250);
            }
        }
    }
}

