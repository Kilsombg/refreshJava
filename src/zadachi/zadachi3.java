package zadachi;

import Utility.ArrayUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zadachi3 {
    public static void main(String[] args) {
        /*
        int zadacha1 = productOfLists(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3, 8, 2)
        );
        System.out.println(zadacha1);*/

/*
        List<Integer> zadacha2 = evenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(Arrays.toString(zadacha2.toArray()));
*/

      /*
        float[] zadacha3_1 = zadacha3(1,2,3,4);
        float[] zadacha3_2 = zadacha3(1,2,3,4,5,6,7,8);
        System.out.println(Arrays.toString(zadacha3_1));
        System.out.println(Arrays.toString(zadacha3_2));
      */

/*
        String zadacha4 = textByIndexes("Hello world.", 3,5,2,1,6,1,1);
        System.out.println(zadacha4);*/

/*
        recurChar("This is a test!1");
        recurChar("0123456789");*/


    }


    /*
    1. Напишете програма, в която се създава функция с два аргумента, явяващи се
            числови списъци. Резултатът се явява число, равно на сумата от двойките
            произведения на елементите на списъците. Ако в един от списъците елементите
            са по-малко от другия, то недостигащите елементи се получават посредством
            циклично повторение на съдържанието на списъка.
    */
    private static int productOfLists(List<Integer> list1, List<Integer> list2) {
        int length = Math.min(list1.size(), list2.size());
        int sum = 0;
        int max = Math.max(list1.size(), list2.size());

        for (int i = 0; i < length; i++) {
            sum += list1.get(i) * list2.get(i);
        }

        // list1 is bigger
        if (list1.size() == max) {
            sum = cycle(sum, list1, list2, max, length);
        } else { // list2 is bigger
            sum = cycle(sum, list2, list1, max, length);
        }

        return sum;
    }


    private static int cycle(int sum, List<Integer> biggerList, List<Integer> smallerList, int max, int min) {
        for (int i = min; i < max; i++) {
            sum += biggerList.get(i) * smallerList.get(i % min);
        }

        return sum;
    }

    /*
            2. Съставете програма с функция, която получава като аргумент числов списък и
            връща като резултат друг списък, в който са включени само четните числа от
            списъка аргумент.
    */
    private static List<Integer> evenNumbers(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        return evenList;
    }


    /*
            3. Напишете програма с функция с произволен брой числови аргументи, която
            връща като резултат списък от три елемента: средноаритметичната,
            максималната и минималната стойност на аргументите.
    */
    private static float[] zadacha3(int... a) {
        float result[] = new float[3];

        result[0] = (float) ArrayUtility.average(a);
        result[1] = (float) ArrayUtility.maximumNumber(a);
        result[2] = (float) ArrayUtility.minimumNumber(a);

        return result;
    }


/*

        4. Да се състави програма с функция с един текстов аргумент и произволен брой
        целочислени аргументи. Резултатът се явява текст, сформиран от буквите на
        първия текстов аргумент. Целочислените аргументи определят индексите на
        буквите, които трябва да влязат в текста резултат.
*/

    private static String textByIndexes(String text, int... indexes) {
        StringBuilder result = new StringBuilder(indexes.length);

        for (int index : indexes) {
            result.append(text.charAt(index));
        }

        return result.toString();
    }

/*

        5. Да се състави програма с функция, която получава като аргументи референция
        към функция и две цели числа. Функцията връща като резултат най-голямата
        стойност на предадената като първи аргумент функция в целочислените точки
        на диапазона, границите на които се определят от втория и третия аргумент.
*/


/*

        6. Напишете програма, в която по метода на рекурсията символите от текста,
        предаден като аргумент на функцията, се изобразяват „през един“: т.е. изписва
        се първият, третият, петият и т.н. символ.
*/

    private static void recurChar(String text) {
        int length = text.length() % 2 == 0 ? text.length() : text.length() - 1;
        if (length > 2) recurChar(text.substring(0, length - 2));
        System.out.println(text.charAt(length - 2));
    }

/*

        7. Да се състави програма с използване на функция генератор, създаваща
        итерируем обект с имената на месеците.
*/

//    private static String month(){
//    }

/*

        8. Да се състави програма с функция генератор, създаваща итерируем обект със
        степени на двойката. Броят на елементите се определя от аргументите на
        функцията генератор.
*/

/*

        9. Съставете клас на Python с името Student с две свойства: student_id и
        student_name. Добавете ново свойство student_class. Създайте функция за
        извеждане на цялото свойство и техните стойности в класа Student.

*/
/*

        10. Съставете програма на Python с използването на клас за преобразуване на цяло
        десетично число в римския му еквивалент и обратно.

*/
/*

        11. Да се състави програма на Python с използването на клас за обръщането на низ
        дума по дума.

*/
/*

        12. Да се състави програма с използването на клас с два метода get_String и
        print_String. Методът get_String приема символен низ от потребителя, а
        print_String извежда символния низ с главни букви.
*/

}
