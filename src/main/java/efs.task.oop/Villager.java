package efs.task.oop;

public class Villager implements Fighter {
    private int health;
    private String name;
    private int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old");
    }

    public void attack(Fighter victim) {
        victim.takeHit((int)((100 - this.age * 0.5)/10));
    }

    public void takeHit(int damage) {
        if(this.health - damage > 0 ){
            this.health -= damage;
        }
        else {
            this.health = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
