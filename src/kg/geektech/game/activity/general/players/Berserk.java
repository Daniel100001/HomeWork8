package kg.geektech.game.activity.general.players;

public class Berserk extends Hero{

    private int BerserkRevert;
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if(boss.getHealth() > 0 && this == hero[i]){
                hero[i].setDamage(boss.getDamage() / 2 + hero[i].getDamage());
                System.out.println(this.getClass().getSimpleName() + " " + "Use revert [" + hero[i].getDamage() + "]");
            }
        }
    }
}
