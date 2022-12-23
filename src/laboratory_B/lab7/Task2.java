package laboratory_B.lab7;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Car1");
        list.add("Car5");
        list.add("Car3");
        list.add("Car6");
        list.add("Car2");

        System.out.println("Linked List Content: " + list);
        list.addFirst("First Car");
        list.addLast("Last Car");
        System.out.println("LinkedList Content after addition: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + list);
        list.add(0, "New Car");
        list.remove(2);

        System.out.println("Final Content: " + list);

        System.out.println("List size: " + list.size());

        System.out.println("The element at position 2: " + list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
