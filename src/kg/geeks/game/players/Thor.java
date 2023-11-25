package kg.geeks.game.players;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.PAUSE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int rand = (int) ( Math.random() * 3 + 2);

        if (boss.getHealth()>0 && boss.getDamage()!=0 && rand%2==0&&this.getHealth()>0){
            boss.setDamage(0);
            System.out.println("--> Boss fell asleep");
        }else if(boss.getHealth()>0 && boss.getDamage()==0){
            boss.setDamage(50);
        }

    }
}
