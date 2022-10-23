import java.util.ArrayList;
import java.util.List;

public class Main {
    private static class Number{
        int x = 1;
        int y;

        public Number(int y){
            this.y = y;
        }
    }

    public static void main(String[] args) {
//        int[] arr = new int[] {6,3,2,8,6,5,2,3,4,5,1,2,3,6,5};
//        System.out.println(ArrayRefresh.maxArray(arr));

//        System.out.println(3 % 5);
//        System.out.println(3 % 3);
//        System.out.println(5 % 3);

        List<Number> numbers = new ArrayList<>();
        for(int i=0; i<5; i++){
            numbers.add(new Number(i));
        }

//        for(Number number : numbers){
//            number.x = 0;
//            number.y -= 5;
//        }

        for(int i=0; i<5; i++){
            System.out.println("x = " + numbers.get(i).x + "\ty = " + numbers.get(i).y);
        }
    }
}