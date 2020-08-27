package Hero;

public class Warrior extends Hero{


    public Warrior(int herohealth, int heroDamage, String heroDefencetype) {
        super(herohealth, heroDamage, heroDefencetype);
    }

    @Override
    public void superAbilityType() {
        System.out.println("воин атакует с земли " + getHeroDefencetype());
    }
}
