package laboratory_B.lab8;

public class Task1 {
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("java");

        System.out.println(s1 + " has hash code: " + s1.hashCode());
        System.out.println(s2 + " has hash code: " + s2.hashCode());
        System.out.println(s3 + " has hash code: " + s3.hashCode());
        System.out.println(s4 + " has hash code: " + s4.hashCode());

        System.out.println("Are they equal? " + s1.equals(s2));
        System.out.println("Are they equal? " + s1.equals(s3));
    }
}
