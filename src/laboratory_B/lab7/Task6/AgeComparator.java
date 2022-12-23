package laboratory_B.lab7.Task6;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int firstPersonAge = o1.getAge();
        int secondPersonAge = o2.getAge();
        return firstPersonAge - secondPersonAge;
    }
}
