package laboratory.sedmica_9;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        map.forEach((k,v) -> System.out.println(v));

        map.values().forEach(System.out::println);

        map.entrySet().forEach(e ->
                System.out.println(e.getKey() + " " + e.getValue()));



        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1,2);
        map1.put(2,4);
        Integer original = map1.replace(2,10);
        System.out.println(map1);
        map1.replaceAll((k,v) -> k+v);
        System.out.println(map1);


        BiFunction<String, String, String> mapper = (v1,v2)
        -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favourites = new HashMap<>();
        favourites.put("Jenny", "Bus Tour");
        favourites.put("Tom", "Tram");

        String jenny = favourites.merge("Jenny", "Skyride", mapper);
        String tom = favourites.merge("Tom", "Skyride", mapper);

        System.out.println(favourites);
        System.out.println(jenny);
        System.out.println(tom);



    }
}
