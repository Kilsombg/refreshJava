package laboratory.sedmica_8;

import java.util.*;

public class Duckling {
    public static void makeSound(String sound) {
        // give body to speak method
        LearnToSpeak learner = s -> System.out.println(s);
        DuckHelper.teacher(sound, learner);
    }

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list);
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);

        Collection<String> cats = Arrays.asList("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));


        String[] array = new String[] {"a","b","c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "z";

        System.out.println(asList); // [z,b,c]
        System.out.println(of);     // [a,b,c]
        System.out.println(copy);   // [a,b,c]

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x,b,c]


        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.replaceAll(x -> x*2);
        System.out.println(numbers);    // [2,4,6]


        for(String string : list) {
            System.out.println(string);
        }

        Iterator<Integer> iter = numbers.iterator();
        while(iter.hasNext()) {
            Integer number = iter.next();
            System.out.println("i " + number);
        }

    }
}