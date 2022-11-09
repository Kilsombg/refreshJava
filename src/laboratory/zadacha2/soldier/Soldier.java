package laboratory.zadacha2.soldier;

import laboratory.zadacha2.modifier.AttackModifier;
import laboratory.zadacha2.modifier.DefenceModifier;
import laboratory.zadacha2.modifier.IModifier;

import java.util.ArrayList;
import java.util.List;

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

    private Soldier target = null;


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

    private List<AttackModifier> getAttackModifiers() {
        List<AttackModifier> attackModifiers = new ArrayList<>();
        for (IModifier modifier : modifiers) {
            if (modifier instanceof AttackModifier) attackModifiers.add((AttackModifier) modifier);
        }
        return attackModifiers;
    }

    private List<DefenceModifier> getDefenceModifiers() {
        List<DefenceModifier> defenceModifier = new ArrayList<>();
        for (IModifier modifier : modifiers) {
            if (modifier instanceof DefenceModifier) defenceModifier.add((DefenceModifier) modifier);
        }
        return defenceModifier;
    }

    void chooseTarget(List<Soldier> enemies) {
        double maxDmg = 0;
        for (Soldier enemy : enemies) {
            double dealtDmg = getDamageAgainst(enemy);
            if (maxDmg < dealtDmg) {
                maxDmg = dealtDmg;
                target = enemy;
            }
        }
    }

    double getDamageAgainst(Soldier enemy) {
        double modAtt = 0;
        for (AttackModifier mod : getAttackModifiers()) {
            modAtt += mod.bonusDamage(this, enemy);
        }
        return attack + modAtt;
    }

    double getDamageFrom(Soldier enemy, int value, AttackType type) {
        double defence = type == AttackType.MELEE ? meleeDefence : rangedDefence;
        double modDefence = 0;
        for (DefenceModifier mod : getDefenceModifiers()) {
            modDefence += mod.bonusDefence(this, enemy);
        }
        double damageFrom = enemy.attack - defence - modDefence;
        ;
        return damageFrom > 0 ? damageFrom : 1;
    }

    void receiveAttack(Soldier enemy, int value, AttackType type) {
        health -= getDamageFrom(enemy, value, type);
        if (health < 0) health = 0;
    }
}
