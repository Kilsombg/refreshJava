package laboratory.zadacha1;

public class Crate {
    public String name;
    public int quantity;

    public static int capacity = 10;

    public Crate(){ }

    public Crate(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
}
