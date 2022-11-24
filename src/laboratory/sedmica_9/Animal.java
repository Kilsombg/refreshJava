package laboratory.sedmica_9;

import org.jetbrains.annotations.NotNull;

public class Animal implements Comparable<Animal> {
    private int id;

    @Override
    public int compareTo(@NotNull Animal a) {
        return id - a.id;
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();
        a1.id = 5;
        a2.id = 7;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));
    }
}