package laboratory.zadacha1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Fabric {
    Collection<AssemblyLine> assemblyLines;

    List<Crate> produce(float load) {
        List<Crate> crates = new ArrayList<>();

        for (AssemblyLine line : assemblyLines) {
            crates.addAll(line.produce(load));
        }

        return crates;
    }
}
