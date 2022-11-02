package laboratory.zadacha2.modifier;

import laboratory.zadacha2.soldier.AttackType;
import laboratory.zadacha2.soldier.Soldier;

public class DefenceModifier {
    private final String tag;
    private final int value;

    public DefenceModifier(String tag, int value) {
        this.tag = tag;
        this.value = value;
    }

    public double bonusDefence(Soldier soldier, Soldier enemy) {
        if (soldier.getAttackType() == AttackType.MELEE)
            return enemy.getTags().contains(tag) ? enemy.getMeleeDefence() + value : soldier.getMeleeDefence();
        else
            return enemy.getTags().contains(tag) ? enemy.getRangedDefence() + value : soldier.getRangedDefence();
    }
}
