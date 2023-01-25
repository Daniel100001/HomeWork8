package kg.geektech.game.activity.general.players;

import java.util.Random;

public class Tank extends Hero {

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.ARMOR);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if(boss.getHealth() > 0 ){

            }
          }
        }
    }


