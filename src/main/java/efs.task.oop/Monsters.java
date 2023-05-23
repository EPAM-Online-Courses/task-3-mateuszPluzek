package efs.task.oop;

public class Monsters {

    static final Monster andariel = new Monster(10, 70) {
        int tmp;
        @Override
        public void takeHit(int damage) {

            if(this.getHealth() - damage < 0) {
                Monsters.monstersHealth -= (this.getHealth());
            }
            else {
                Monsters.monstersHealth -= damage;
            }
            super.takeHit(damage);

            if(Monsters.monstersHealth < 0) {
                Monsters.monstersHealth = 0;
            }
        }
    };

    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void takeHit(int damage) {

            if(this.getHealth() - (damage + 5) < 0) {
                Monsters.monstersHealth -= (this.getHealth());
            }
            else {
                Monsters.monstersHealth -= (damage + 5);
            }
            super.takeHit(damage + 5);

            if(Monsters.monstersHealth < 0) {
                Monsters.monstersHealth = 0;
            }
        }
    };

    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

}

