public class Arena {
    public static void main(String[] args) {
        WaterMonster kimouille = new WaterMonster("kimouille", 20, 100);
        FireMonster kibrule = new FireMonster("kibrule", 20, 100);
        WaterMonster kiarrose = new WaterMonster("kiarrose", 20, 100);
        GrassMonster kiglisse = new GrassMonster("kiglisse", 20, 100);
        kimouille.takeHit(kibrule);
        kibrule.takeHit(kimouille);
        kimouille.takeHit(kiarrose);
    };

};