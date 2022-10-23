package laboratory.zadacha1;

import java.util.ArrayList;
import java.util.List;

public class CombinedLine extends AssemblyLine {
    CucumberLine cucumberLine;
    WatermelonLine watermelonLine;

    @Override
    public List<Crate> produce(float load) {
        List<Crate> crates = new ArrayList<>();

        // get the cucumbers jars
        if (cucumberLine == null)
            return null;
        crates.addAll(cucumberLine.produce(load));

        // get the watermelon jars
        if (watermelonLine == null)
            return null;
        crates.addAll(watermelonLine.produce(load));

        // check if there is a way to combine the last crates
        int lastJarsCount = crates.get(cucumberLine.capacity-1).quantity + crates.get(crates.size()-1).quantity;
        if(lastJarsCount < cucumberLine.capacity){
            crates.get(cucumberLine.capacity-1).quantity +=  crates.get(crates.size()-1).quantity;
            crates.remove(crates.size()-1);
        } else if(lastJarsCount < watermelonLine.capacity){
            crates.get(crates.size()-1).quantity +=  crates.get(cucumberLine.capacity-1).quantity;
            crates.remove(cucumberLine.capacity-1);
        }

        for (Crate crate : crates) {
            crate.name = "combined";
        }

        return crates;
    }
}
