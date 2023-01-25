package kg.geektech.game.activity.general;

import kg.geektech.game.activity.general.players.*;

import java.util.Random;

public class RPG_GAME {
    public static Random random = new Random();
    static int roundCount;
    public static void startGame(){
        Boss boss = new Boss(1500,50);

        Warrior warrior = new Warrior(270 , 25);
        Magic magic = new Magic(250,25,10);
        Berserk berserk = new Berserk(230 , 25);
        Medic doc = new Medic(230,5, 10);
        Medic assistent = new Medic(290,5,5);
        Thor thor = new Thor(200,5);

        Hero[] heroes = {warrior,magic, berserk, assistent,doc,thor};
        printStatistics(boss , heroes);
        while (!isGameFinish(boss,heroes)){
            round(boss,heroes);
            roundCount++;
        }

    }
    private static void heroesSuperAbility(Boss boss,Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth() > 0 && boss.getHealth() > 0){
                heroes[i].applySuperPower(boss,heroes);
            }
        }
    }

    private static void round(Boss boss, Hero[] heroes){
        bossHits(boss, heroes);
        heroHits(boss,heroes);
        heroesSuperAbility(boss,heroes);
        printStatistics(boss,heroes);
    }
    private static void heroHits(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - heroes[i].getDamage());

        }
    }



    private static void bossHits(Boss boss, Hero[] heroes){
        if (boss.getDamage() == 0){
            boss.setDamage(50);
        }
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());

        }
    }

    private static boolean isGameFinish(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes wins");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }

        }
        if (allHeroesDead) {
            System.out.println("Boss won");
        }
        return allHeroesDead;
    }
    private static void printStatistics(Boss boss,Hero[] heroes){
        System.out.println("----------------------------------------");
        System.out.println("Round - " + roundCount);
        System.out.println("Boss health: " + boss.getHealth() + " " + "Damage [" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + " health: " + heroes[i].getHealth() + " " + "Hero damage [" + heroes[i].getDamage() + "]");

        }
        System.out.println("        ");
    }

}

