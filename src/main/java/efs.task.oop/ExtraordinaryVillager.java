package efs.task.oop;

public class ExtraordinaryVillager extends Villager {

    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String message;

        Skill(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }
    }

    Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + this.getName() + " and I'm " + this.getAge() + " years old"
                + ". " + this.skill.getMessage());
    }

    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    public void takeHit(int damage) {
        this.setHealth(0);
    }

}

