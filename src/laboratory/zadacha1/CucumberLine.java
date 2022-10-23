package laboratory.zadacha1;

import java.util.ArrayList;
import java.util.List;

public class CucumberLine extends AssemblyLine {
    public CucumberLine(int capacity){
        this.name = "cucumber";
        this.capacity = capacity;
    }

    @Override
    public List<Crate> produce(float load) {
        // Calculate jars by load
        int jarsCount = (int) Math.floor(this.capacity * load);

        // Create the crates
        List<Crate> crates = new ArrayList<>();
        for (int i = 0; i < jarsCount; i = i + Crate.capacity) {
            crates.add(new Crate(this.name, Crate.capacity));
        }
        if (jarsCount % Crate.capacity != 0) {
            int left = jarsCount % Crate.capacity;
            crates.add(new Crate(this.name, left));
        }

        // Return the list
        return crates;
    }
}
