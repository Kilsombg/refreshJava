package laboratory.sedmica_9;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck>{
    private String name;
            public Duck(String name){
        this.name = name;
            }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(@NotNull Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
