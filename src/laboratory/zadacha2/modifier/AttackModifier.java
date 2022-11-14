package laboratory.zadacha2.modifier;

import laboratory.zadacha2.soldier.Soldier;

public class AttackModifier {
    private final String tag;
    private final int value;

    public AttackModifier(String tag, int value) {
        this.tag = tag;
        this.value = value;
    }

    public double bonusDamage(Soldier soldier, Soldier enemy) {
        return enemy.getTags().contains(tag) ?  value : 0;
    }
}
