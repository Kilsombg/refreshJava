package laboratory.zadacha2.modifier;

import laboratory.zadacha2.soldier.Soldier;
import org.jetbrains.annotations.NotNull;

public class AttributeModifier implements IModifier {
    private final String attributeName;
    private final int value;

    public AttributeModifier(String attributeName, int value) {
        this.attributeName = attributeName;
        this.value = value;
    }

    void addToSoldier(@NotNull Soldier soldier) {
        soldier.addModifier(this);

        switch (attributeName) {
            case "maxHealth" -> soldier.setMaxHealth(soldier.getMaxHealth() + value);
            case "attack" -> soldier.setAttack(soldier.getAttack() + value);
            case "meleeDefence" -> soldier.setMeleeDefence(soldier.getMeleeDefence() + value);
            case "rangedDefence" -> soldier.setRangedDefence(soldier.getRangedDefence() + value);
            default -> System.out.println("Incorrect attributeName: " + attributeName);
        }
    }
}
