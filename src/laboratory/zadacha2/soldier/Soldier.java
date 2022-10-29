package laboratory.zadacha2.soldier;

import java.util.List;

enum AttackType {
    MELEE,
    RANGED
}

enum Modifier {

}

public class Soldier {
    private String name;
    private AttackType attackType;
    private double health;
    private double attack;
    private double meleeDefence;
    private double rangedDefence;
    private List<String> tags;
    private List<Modifier> modifiers;


    public Soldier(
            String name,
            double health,
            double attack,
            double meleeDefence,
            double rangedDefence,
            AttackType attackType
    ) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.meleeDefence = meleeDefence;
        this.rangedDefence = rangedDefence;
        this.attackType = attackType;
    }

    public void addModifier(Modifier modifier) {
        if (modifier != null)
            this.modifiers.add(modifier);
    }


    /* d.	Дефинирайте гетъри за характеристиките на героя. Всеки гетър трябва да връща сумата от начална стойност
 на атрибута + всички приложими модификатори за него: текущи и максимални точки живот, сила на атаката,
 ръкопашна и стрелкова защита */

    /* implement bonuses from modifiers */
    public void printCharacteristic() {
        System.out.println(
                this.name
                        + "\nHP: " + this.health
                        + "\nATK: " + this.attack
                        + "\nDEF: " + this.meleeDefence + "/" + this.rangedDefence
                        + "\nModifiers"
        );
        for (Modifier modifier : this.modifiers){
            System.out.println(modifier);
        }
    }


}
