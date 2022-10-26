package su;

import java.util.Scanner;

public class su3 {
    public static void main(String[] args) {
        /*
        • 1. Програма, в която чете въведени от потребителя числа, записва ги в променливи a и b от тип double.
         Стойностите на двете променливи се разменят, ако първата е по-голяма от втората.
*/
      /*  Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if(a>b){
            a = a+b;
            b = a-b;
            a = a-b;
        }
        System.out.println("a = " + a + "  b = " + b);*/

         /*• 2. Напишете програма, която прилага бонус точки към въведени от потребителя точки в диапазона [1...9]
          по следните правила:
          -ако точките са между 1 и 3, програмата го умножава по 10;
          -ако точките са между 4 и 6, програмата го умножава по 100;
          -ако точките са между 7 и 9, програмата го умножава по 1000;
          -ако точките са 0 или по-малко, както и повече от 9, програмата отпечатва „невалиден резултат“.*/
/*
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();
        if(points >= 1 && points<=3){
            points *= 10;
        }else if(points >= 4 && points<=6){
            points *= 100;
        }if(points >= 7 && points<=9){
            points *= 1000;
        } else System.out.println("Invalid result");
*/


          /*• 3. Напишете програма, която показва знака (+, -или 0) на произведението на три реални числа,
          без да го пресмята. Използвайте последователност от if оператори.*/
        /*Scanner scanner = new Scanner(System.in);
        boolean positive = true;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a == 0 || b == 0 || c == 0) {
            System.out.println(0);
            return;
        }
        if (a < 0) positive = !positive;
        if (b < 0) positive = !positive;
        if (c < 0) positive = !positive;
        if (positive) System.out.println("+");
        else System.out.println("-");*/


          /*• 4. Създайте програма, която при въведено от конзолата цяло положително  число  n, отпечатва на един ред,
          разделени с интервал,всички числа от 1 до n, които не се делят на 3 или 7.*/
        /*int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 3 != 0 && i % 7 != 0)
                System.out.print(i + " ");
        }*/


          /*• 5. Напишете програма, която чете от конзолата цяло положително число n и отпечатва числата от 1 до n
          и след това числата от n -1 до 1 на един ред, разделени с интервал.*/
       /* Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
                System.out.print(i + " ");}
            for (int i = n-1; i > 0; i--) {
                System.out.print(i + " ");
        }*/


          /*• 6. Напишете програма, която чете от конзолата цяло положително число n (1 ≤ n ≤ 20)
          и отпечатва матрица като в примерите по-долу. Използвайте два вложени цикъла.
          n     matrix   n   matrix  n   matrix
          2       1 2    3   1 2 3   4   1 2 3 4
                  2 3        2 3 4       2 3 4 5
                             3 4 5       3 4 5 6
                                         4 5 6 7
          */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(i+j + " ");
            }
            System.out.println();
        }*/


          /*• 7. Създайте програма, която чете два масива от тип int, въведени от потребителяс размер N и
          ги сравнява елемент по елемент.Създайте метод int[]  fillArray(int  index,  int[]  arr, Scanner  s)
          за попълване на масивите. Потърсете информацияи използвайте метода Arrays.equals().
          След    сравнение  наелементите  на масивите нека  програмата  да отпечатва "Equal" или "Not equal" в
          зависимост от резултата.*/



          /*• 8. Напишете програма, която определя дали масив от цели числа,въведени от
          потребителя,е сортиран във възходящ ред.Потърсете информация и използвайте метода Arrays.sort().
          В зависимост от резултата нека програмата да отпечатва "Yes" или "No".*/

         /* • 9. Напишете програма,
          която намира дали масив от цели числа, въведен от потребителя, е симетричен -т.е. първото число
          е равно на последното, второто -на предпоследното и т.н.
          (Input:1 2 3 4 4 3 2 1 Output:YesInput:7 8 9 8 7 Output:Yes Input:3 4 5 3 45 Output:No)*/

        /*  • 10. Напишете програма, която намира повтарящото се числов масив от цели числа, въведен от потребителя.*/

        /*  • 11. Напишете програма, която намира първатадвойкацели числа,вмасив от цели числа, въведен от потребителя,
           чиято сума е равна на дадено число, също въведеноот потребителя(Input:61 2 3 4 3 6 5 8 3 9Output:1, 5).*/
for(;;){
    System.out.println("d");
}
    }
}
