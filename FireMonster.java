/**
 * FireMonster
 */
public class FireMonster extends Monster {
    
    public FireMonster(String name, int damage, int life) {
        super(name, damage, life);
        this.type = "fire";
    }
    public void takeHit(Monster adverMonster){
        if(adverMonster.type == "water"){
            adverMonster.damage = adverMonster.damage * 2 ;
        }
        else if (adverMonster.type == "grass"){
            adverMonster.damage = adverMonster.damage / 2 ;
        };
        this.life = this.life - adverMonster.damage;
        if (this.life > 0) {
        System.out.println(this.name + " has " + this.life + " points remaining.");
        } else {
            System.out.println(this.name + " is KO!");
        }
    };
}