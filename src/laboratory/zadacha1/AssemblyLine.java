package laboratory.zadacha1;

import java.util.List;

abstract public class AssemblyLine {
    public String name;
    public int capacity;
    abstract public List<Crate> produce(float load);
}
