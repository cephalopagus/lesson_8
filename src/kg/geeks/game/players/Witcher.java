package kg.geeks.game.players;

public class Witcher extends Hero{

    private int random_resurrection;

    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.RESURRECTION, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        random_resurrection = (int) ( Math.random() *2+1);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0 && this != heroes[i] && random_resurrection==2 && this.getHealth()>0) {
                heroes[i].setHealth(heroes[i].getHealth() + 200);
                System.out.println("--> Witcher resurrected "+heroes[i].getName());
                this.setHealth(0);
            }
        }
    }
}
