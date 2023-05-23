package efs.task.oop;

public class Main {
    public static void main(String[] args) {


        Villager kashya = new Villager("Kashya", 30);
        kashya.sayHello();
        Villager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        akara.sayHello();
        Villager gheed = new Villager("Gheed", 50);
        gheed.sayHello();
        Villager decardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        decardCain.sayHello();
        Villager warriv = new Villager("Warriv", 35);
        warriv.sayHello();
        Villager flawia = new Villager("Flawia", 25);
        flawia.sayHello();

        Object objectDecardCain = decardCain;
        Object objectAkara = akara;

        Villager[] osadnicy = new Villager[] {kashya, gheed, warriv, flawia};

        int iterOsadnik = 0;
        int iterMonsters = 0;
        while(Monsters.monstersHealth > 0) {

            if(iterOsadnik == osadnicy.length) {
                iterOsadnik = 0;
            }
            if(osadnicy[iterOsadnik].getHealth() <= 0) {
                iterOsadnik += 1;
            }
            if(iterOsadnik == osadnicy.length) {
                iterOsadnik = 0;
            }

            if((iterMonsters == 0 && Monsters.andariel.getHealth() > 0) || (iterMonsters == 1 && Monsters.blacksmith.getHealth() <= 0)) {
                osadnicy[iterOsadnik].attack(Monsters.andariel);
                iterMonsters = 1;
            }
            else if((iterMonsters == 1 && Monsters.blacksmith.getHealth() > 0) || (iterMonsters == 0 && Monsters.andariel.getHealth() <= 0)) {
                osadnicy[iterOsadnik].attack(Monsters.blacksmith);
                iterMonsters = 0;
            }

            System.out.println("Potwory posiadaja jeszcze "+ Monsters.monstersHealth +" punkty zycia");
            System.out.println("Aktualnie walczacy osadnik to " + osadnicy[iterOsadnik].getName());

            if((iterMonsters == 0 && Monsters.andariel.getHealth() > 0) || (iterMonsters == 1 && Monsters.blacksmith.getHealth() <= 0)) {
                Monsters.andariel.attack(osadnicy[iterOsadnik]);
            }
            else if((iterMonsters == 1 && Monsters.blacksmith.getHealth() > 0) || (iterMonsters == 0 && Monsters.andariel.getHealth() <= 0)) {
                Monsters.blacksmith.attack(osadnicy[iterOsadnik]);
            }

            iterOsadnik += 1;
        }

        System.out.println("Obozowisko ocalone!");

        decardCain = (ExtraordinaryVillager) objectDecardCain;
//        decardCain.sayHello();

    }
}
