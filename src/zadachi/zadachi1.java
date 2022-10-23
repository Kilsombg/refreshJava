package zadachi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadachi1 {
    public static void main(String[] args) {
        /* 1. Да се състави програма, която намира всички числа в интервала [1,1000], които
         завършват на 7. */
//        for(int i=0; i<1000; i++)
//            if (i % 7 == 0)
//                System.out.printf("%d\n", i);

        /* 2. Да се състави програма, която изчислява сумата и произведението на всички
        числа от 1 до дадено число n. */
//        int sum=0, product=1;
//        int n = 5;
//        for(int i=1; i<n; i++)
//        {
//            sum+=i;
//            product*=i;
//        }
//        System.out.printf("sum = %d, product = %d", sum, product );

        /* 3. Да се състави програма, която отпечатва таблицата за умножение за дадено
         число. */
//        int x = 3;
//        for(int i=1; i<10; i++)
//            System.out.printf("%d*%d=%d\n",i,x,i*x);

        /*  4. Да се състави програма, която извежда числата от -10 до -1. */
//        for(int i=-10;i<0;i++)
//            System.out.println(i + " ");

        /*  5. Да се състави програма, която извежда всички прости числа в диапазона от 25
        до 50. */
//        for(int i=25;i<=50;i++)
//        {
//            boolean flag = true;
//            for(int j=2; j<i/2; j++)
//                if(i % j == 0) {
//                    flag = false;
//                    break;
//                }
//
//            if(flag)
//                System.out.println(i);
//        }

        /*  6. Да се състави програма, която извежда следния модел:
            # *
            # **
            # ***
            # ****
            # *****
            # ****
            # ***
            # **
            # *
        */
        

        /* 7. Да се състави програма, която обръща цифрите на дадено число:

            # Пример: Дадено е числото 76542
            # Да се изведе: 24567
        */
//        int number = 76542;
//        int reverseNumber=0;
//
//        do
//        {
//            reverseNumber = number%10 + reverseNumber*10;
//            number = number/10;
//        } while(number!=0);
//
//        System.out.println(reverseNumber);

        /* 8. Да се състави програма, която въвежда от клавиатурата n числа и сумира
        поотделно всички четни и нечетни числа. Програмата да извежда общата
        сума и за двата случая.
        */
//        int n = 5;
//        int sumEven = 0, sumOdd = 0;
//        Scanner input = new Scanner(System.in);
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++)
//        {
//            numbers[i] = input.nextInt();
//            if(numbers[i] % 2 == 0) sumEven += numbers[i];
//            else sumOdd += numbers[i];
//        }
//        System.out.printf("even sum: %d\nodd sum: %d", sumEven,sumOdd);

        /* 9. Да се състави програма, която въвежда n числа от клавиатурата и намира
        средноаритметичната им стойност (1≤n≤1000).
        */
//        int sum=0, n=4, x;
//        Scanner input = new Scanner(System.in);
//        for(int i=0; i<n; i++){
//            x = input.nextInt();
//            sum+=x;
//        }
//        System.out.println((double)sum/n);

        /* 10. Да се състави програма, която въвежда n числа (n≤10) на брой реални числа
        по-малки от 1000 и намира тяхното произведение.
        */
//        int p=1, n=5, x;
//        Scanner input = new Scanner(System.in);
//        for(int i=0; i<n; i++)
//        {
//            x = input.nextInt();
//            if(x>1000) {i--; continue;}
//            p*=x;
//        }
//        System.out.println(p);

        /* 11. Да се състави програма, която въвежда n на брой числа от клавиатурата и
        намира сумата само на онези от тях, които са отрицателни.
        */
//        int sum=0, n=4, x;
//        Scanner input = new Scanner(System.in);
//        for(int i=0; i<n; i++)
//        {
//            x = input.nextInt();
//            if(x<0) sum+=x;
//        }
//        System.out.println(sum);

        /* 12. Да се състави програма, която въвежда n на брой числа от клавиатурата и
        намира сумата само на онези от тях, които са по-големи от предварително
        зададено число k.
        */
//        int k=3,n=4,x,sum=0;
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<n; i++)
//        {
//            x = scanner.nextInt();
//            if(x>k) sum+=x;
//        }
//        System.out.println(sum);

        /*  13. Да се състави програма, която въвежда n на брой числа от клавиатурата и
        намира сумата само на онези от тях, които са по-малки от предварително
        зададено число u и по-големи от предварително зададено число v (u&gt;v).
            v < x < u
        */
//        int n=4,v=2,u=5,x,sum=0;
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<n; i++)
//        {
//            x = scanner.nextInt();
//            if(x < u && x>v) sum+=x;
//        }
//        System.out.println(sum);

        /*  14. Да се състави програма, която въвежда n на брой числа от клавиатурата и
        намира средноаритметичното само на онези от тях, които са по-големи от
        предварително зададено число k.
        */
//        int k=3,n=4,x,sum=0,count=0;
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<n; i++)
//        {
//            x = scanner.nextInt();
//            if(x>k) {sum+=x;count++;}
//        }
//        System.out.println((double)sum/count);

        /* 15. Да се състави програма, която въвежда n на брой числа от клавиатурата и
        намира средноаритметичното само на онези от тях, които са по-малки от
        предварително зададено число u и по-големи от предварително зададено
        число v (u&gt;v).
        */
//        int n=4,v=2,u=5,x,sum=0,count=0;
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<n; i++)
//        {
//            x = scanner.nextInt();
//            if(x < u && x>v) {sum+=x;count++;}
//        }
//        System.out.println((double)sum/count);

        /*  16. Да се състави програма, която въвежда n на брой числа от клавиатурата и
        намира средноаритметичната стойност на всички четни числа и
        произведението на всички нечетни числа.
        */
//        int n=4,sumEven=0,productOdd=1,countEven=0,x;
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<n; i++)
//        {
//            x = scanner.nextInt();
//            if(x%2==0) {sumEven+=x;countEven++;}
//            else productOdd*=x;
//        }
//        System.out.println("avg: " + sumEven/countEven);
//        System.out.println(productOdd);

        /* 17. Да се състави програма, която въвежда две цели числа и извежда
        произведението им само ако произведението е по-голямо от 1000. В
        противен случай да се изведе тяхната сума.
        */
//        int a,b;
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        int result = a * b > 1000 ? a * b : a + b;
//        System.out.println(result);
    }
}