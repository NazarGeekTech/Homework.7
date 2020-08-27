package Hero;

public abstract class Hero implements HavingSuperAbility{
    private int herohealth;
    private int heroDamage;
    private String heroDefencetype;

    public Hero(int herohealth, int heroDamage, String heroDefencetype) {
        this.herohealth = herohealth;
        this.heroDamage = heroDamage;
        this.heroDefencetype = heroDefencetype;
    }

    public int getHerohealth() {
        return herohealth;
    }

    public void setHerohealth(int herohealth) {
        this.herohealth = herohealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroDefencetype() {
        return heroDefencetype;
    }

    public void setHeroDefencetype(String heroDefencetype) {
        this.heroDefencetype = heroDefencetype;
    }
}
