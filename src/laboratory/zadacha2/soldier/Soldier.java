package laboratory.zadacha2.soldier;

import laboratory.zadacha2.modifier.IModifier;

import java.util.List;
import java.util.logging.LogManager;

public class Soldier {
    private String name;
    private AttackType attackType;
    private double health;
    private double maxHealth;
    private double attack;
    private double meleeDefence;
    private double rangedDefence;
    private List<String> tags;
    private List<IModifier> modifiers;


    public Soldier(
            String name,
            double maxHealth,
            double attack,
            double meleeDefence,
            double rangedDefence,
            AttackType attackType
    ) {
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.meleeDefence = meleeDefence;
        this.rangedDefence = rangedDefence;
        this.attackType = attackType;
    }

    public void addModifier(IModifier modifier) {
        if (modifier != null)
            this.modifiers.add(modifier);
    }

    /* d.	Дефинирайте гетъри за характеристиките на героя. Всеки гетър трябва да връща сумата
    от начална стойност на атрибута + всички приложими модификатори за него: текущи и максимални точки живот,
     сила на атаката, ръкопашна и стрелкова защита */

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public double getMeleeDefence() {
        return meleeDefence;
    }

    public void setMeleeDefence(double meleeDefence) {
        this.meleeDefence = meleeDefence;
    }

    public double getRangedDefence() {
        return rangedDefence;
    }

    public void setRangedDefence(double rangedDefence) {
        this.rangedDefence = rangedDefence;
    }

    public List<String> getTags() {
        return tags;
    }

    /* implement bonuses from modifiers */
    public void printCharacteristic() {
        System.out.println(
                this.name
                        + "\nHP: " + this.health + "/" + this.maxHealth
                        + "\nATK: " + this.attack
                        + "\nDEF: " + this.meleeDefence + "/" + this.rangedDefence
                        + "\nModifiers"
        );
        for (IModifier modifier : this.modifiers) {
            System.out.println(modifier);
        }
    }

    @Deprecated
    Soldier chooseTarget(List<Soldier> enemies) {
        return null;
    }

    @Deprecated
    int getDamageAgainst(Soldier enemy) {
        return 0;
    }

    @Deprecated
    int getDamageFrom(Soldier enemy, int value, String type) {
        return 0;
    }

    @Deprecated
    void receiveAttack(Soldier enemy, int value, String type) {

    }

}
