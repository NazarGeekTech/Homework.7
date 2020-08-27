package Hero;

public class Medic extends Hero {


    public Medic(int herohealth, int heroDamage, String heroDefencetype) {
        super(herohealth, heroDamage, heroDefencetype);
    }

    @Override
    public void superAbilityType() {
        System.out.println("медик использует медицинскую силу для излечивание героев" + getHeroDefencetype());
    }
}
