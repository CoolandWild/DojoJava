/**
 * Monster
 */
public abstract class Monster {

    public String name ;
    public int damage ;
    public int life ;
    public String type = "normal" ;
    
    /**
     * InnerMonster
     */
    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage= damage;
        this.life = life;
    }

    public void takeHit(Monster adverMonster){

    }
}