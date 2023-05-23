package efs.task.oop;

abstract class Monster implements Fighter {
    private int health;
    private int damage;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void attack(Fighter victim) {
      victim.takeHit(this.getDamage());
    }

    public void takeHit(int damage) {
        if(this.health - damage > 0 ){
            this.health -= damage;
        }
        else {
            this.health = 0;
        }
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

}
