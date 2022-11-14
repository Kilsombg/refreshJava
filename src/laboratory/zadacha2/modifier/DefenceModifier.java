package laboratory.zadacha2.modifier;

import laboratory.zadacha2.soldier.AttackType;
import laboratory.zadacha2.soldier.Soldier;

public class DefenceModifier {
    private final String tag;
    private int meleeVal;
    private int rangeVal;

    public int getMeleeVal() {
        return meleeVal;
    }

    public int getRangeVal() {
        return rangeVal;
    }

    public DefenceModifier(String tag, int value) {
        this.tag = tag;
        if(tag.equals("melee"))
            this.meleeVal = value;
        else this.rangeVal = value;
    }

    public double bonusDefence(Soldier soldier, Soldier enemy) {
        if (soldier.getAttackType() == AttackType.MELEE)
            return enemy.getTags().contains(tag) ? meleeVal : 0;
        else
            return enemy.getTags().contains(tag) ?  rangeVal : 0;
    }
}
