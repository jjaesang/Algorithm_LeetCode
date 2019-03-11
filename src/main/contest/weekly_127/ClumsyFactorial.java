package main.contest.weekly_127;

/**
 * Created by jaesang on 2019-03-11.
 */
public class ClumsyFactorial {

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }


    public static int clumsy(int N) {

        int result = N;
        int flag = 1;
        for (int i = N - 1; i > 0; i--) {
            if (flag % 4 == 0)
                result = result - i;
            if (flag % 4 == 1)
                result = result * i;
            if (flag % 4 == 2)
                result = result / i;
            if (flag % 4 == 3)
                result = result + i;
            flag++;
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(clumsy(10));
    }
}
