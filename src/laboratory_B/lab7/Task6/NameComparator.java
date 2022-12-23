package laboratory_B.lab7.Task6;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        String firstPersonName = p1.getName().toUpperCase();
        String secondPersonName = p2.getName().toUpperCase();
        return firstPersonName.compareTo(secondPersonName);
    }
}
