package kg.geektech.game.activity.general.players;

public class Magic extends Hero{
    private  int magicPowerPoints;
    public Magic(int health, int damage,int magicPowerPoints ) {
        super(health, damage ,SuperAbility.MAGIC_POWER);
        this.magicPowerPoints = magicPowerPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if(hero[i].getHealth() > 0 && hero[i].getDamage() < 40 && this != hero[i]){
                hero[i].setDamage(hero[i].getDamage() + this.magicPowerPoints);
                System.out.println(this.getClass().getSimpleName() + "Magic power - " + this.magicPowerPoints + " " + this.getClass().getSimpleName());
            }
        }
    }
}
