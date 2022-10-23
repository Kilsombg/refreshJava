package zadachi;

import Utility.ArrayUtility;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class zadachi2 {
    public static void main(String[] args) throws Exception {
//        String[] zadacha1 = randomCharacters(3, 4);
//        System.out.println(Arrays.deepToString(zadacha1));

//        int[][] e = snakeIntegers(0,1);
//        int[][] zadacha2 = snakeIntegers(5, 5);
//        System.out.println(Arrays.deepToString(zadacha2));

//        ArrayList<ArrayList<Integer>> zadacha3 = removeRowCol(5,5,3,3);
//        System.out.println(Arrays.deepToString(zadacha3.toArray()));

//        Integer[] zadacha4 = {4,7,4,5,2,3,1,8};
//        System.out.println(Arrays.deepToString(zadacha4));
//        sortArray(zadacha4);
//        System.out.println(Arrays.deepToString(zadacha4));

        int[] zadacha2 = getMaxNumber(new int[] {2,6,4,8,5,3,1});
        System.out.println(Arrays.toString(zadacha2));
    }

    /*
    1. Напишете програма с функция, която създава вложен списък. Размерите на
    списъка се указват като аргументи на функцията. Списъкът се запълва със
    случайни букви.
    */
//    public static String[] randomCharacters(int row, int col) {
//        char c;
//        Random random = new Random();
//
//        String[] result = new String[row];
//        for (int i = 0; i < row; i++) {
//            result[i] = new String();
//            for (int j = 0; j < col; j++) {
//                c = (char) (65 + random.nextInt(27) + 32 * random.nextInt(2));
//                result[i] = result[i].concat(String.valueOf(c));
//            }
//        }
//        return result;
//    }

    /*
    2. Напишете програма с функция за запълване на вложен списък. Списъкът се
    запълва с естествени числа на принципа на „змията“: най-напред се запълва
    първият ред, след това последната колона (от горе надолу), последният ред (от
    дясно на ляво), първата колона (отдолу нагоре), вторият ред (от ляво на дясно) и
     т.н.
    */
//    private static int[][] snakeIntegers(int x, int y) throws Exception {
//        if (x == 0 || y == 0)
//            throw new Exception("x and y must be bigger than 0");
//
//        int[][] numbers = new int[y][x];
//
//        // get value (0) to the array
//        for (int i = 0; i < y; i++)
//            for (int j = 0; j < x; j++) {
//                numbers[i][j] = 0;
//            }
//
//        int curX = 0;
//        int curY = 0;
//        int number = 1;
//        numbers[0][0] = number;
//        // 'move' the snake
//        while (true) {
//            // right
//            while (curX < x - 1 && numbers[curY][curX + 1] == 0) {
//                curX++;
//                numbers[curY][curX] = ++number;
//            }
//
//            // down
//            while (curY < y - 1 && numbers[curY + 1][curX] == 0) {
//                curY++;
//                numbers[curY][curX] = ++number;
//            }
//
//            // left
//            while (curX > 0 && numbers[curY][curX - 1] == 0) {
//                curX--;
//                numbers[curY][curX] = ++number;
//            }
//
//            // up
//            while (numbers[curY - 1][curX] == 0) {
//                curY--;
//                numbers[curY][curX] = ++number;
//            }
//
//            // stop
//            if (numbers[curY][curX + 1] != 0)
//                break;
//        }
//
//        return numbers;
//    }


    /*
    3. Напишете програма, в която се създава вложен списък от случайни числа. В
    матрицата, която се реализира от дадения вложен списък се изтрива ред и
    колона. Номерът на реда и номерът на колоната, които трябва да бъдат изтрити,
    се въвеждат от потребителя.
    */
//    private static ArrayList<ArrayList<Integer>> removeRowCol(int x, int y, int delCol, int delRow) throws Exception {
//        if (delCol > x || delRow > y) return null;
//
//        ArrayList<ArrayList<Integer>> result = randomNumberList(x, y);
//        System.out.println(Arrays.deepToString(result.toArray()));
//
//        // remove column
//        for(int i=0; i<y; i++){
//            result.get(i).remove(delCol);
//        }
//
//        // remove row
//        result.remove(delRow);
//
//
//        return result;
//    }

    private static int[][] randomNumberArray(int x, int y) throws Exception {
        if (x == 0 || y == 0)
            throw new Exception("size of the array is less than or equal to 0");

        int[][] numbers = new int[y][x];

        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                numbers[i][j] = random.nextInt(20);
            }
        }

        return numbers;
    }

    private static ArrayList<ArrayList<Integer>> randomNumberList(int x, int y) throws Exception {
        if (x == 0 || y == 0)
            throw new Exception("size of the array is less than or equal to 0");

        // get space for the array list
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>(y);
        for (int i = 0; i < y; i++) {
            numbers.add(new ArrayList(x));
        }

        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                numbers.get(i).add(random.nextInt(20));
            }
        }

        return numbers;
    }

/*
4. Напишете програма, в която се изпълнява сортиране по възходящ ред по метода
на мехурчето. Методът е следният: последователно се сравняват стойностите на
съседните елементи и ако стойността на елемента от ляво е по-голяма от
стойността на елемента от дясно, елементите разменят местата си. За едно
пълно обхождане на елементите в списъка елементът с най-голяма стойност ще
се окаже последен в списъка. На второто обхождане предпоследният елемент
ще се окаже елементът с втора по големина стойност и т.н.
*/
private static void sortArray(Integer[] numbers){
    for(int i=1; i<numbers.length; i++)
        for(int j=1; j<numbers.length-i; j++){
            if(numbers[j]<numbers[j-1]){
                ArrayUtility.swap(numbers,j,j-1);
            }
        }
}


/*
5. Напишете програма с функция, която за списък, предаден като аргумент, връща
списък от два елемента: стойността на най-големия елемент в списъка и индекса
на този елемент в списъка (ако такива елементи има няколко, то индекса на
първия от тях).
 */
    private static int[] getMaxNumber(int[] numbers){
        int[] max = new int[2];
        max[0] = numbers[0];

        for(int i=1; i<numbers.length; i++){
            if(max[0] < numbers[i]){
                max[0] = numbers[i];
                max[1] = i;
            }
        }

        return max;
    }
}