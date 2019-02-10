package main.easy;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * Example 1:
 * Input: 121
 * Output: true
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        /**
         * 음수면 Palindrome이 아님
         * 마지막 자리수가 0 이면 맨 앞자리수도 0 이여야하는데, int 자료형 자체에서는 input이 될 수 없음
         * 10 -> 010이 되어야 하지만, 이런 input이 들어올 수 없으므로, 맨자리수가 0인 경우 ( x%10 ) 인 경우는 false
         * 그런데 0, 하나 들어오면 이것은 palidrome이 될 수 있으므로, 0 아닌 경우는 예외 처리 ( x%10 && x!=0 )
         *
         */
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        /**
         * 들어오는 input에 대해 modulur와 divide를 통해 숫자를 뒤집으면.. Integer.MAX_VALUE의 overflow 날 수 잇음
         * 2,147,483,647 를 뒤집으면 ... 7,463,847,412 바로  overflow..
         * 그래서 들어온 input의 반만 나눠서 뒤집고, 반 반 비교하자.. ( = 여기서 생각해야할게, 자리숫가 짝수일때, 홀수 일때 )
         * 짝수이면 그냥 똑같겠지만.. 홀수 라면..
         *
         * 그렇다면, 딱 반으로 쪼갤라면 어떻게.. ?
         * 들어온 input을 10으로 나눠고, 뒤집은 input의 10을 곱해나가다가, 들어온 input이 뒤집은 input보다 작을 경우, 다 짜른거다 .
         * e.x) 14541 ( 홀수 )
         * origin_x / revered_x
         * 0th iter = 1454 / 1
         * 1th iter = 144 / 14 ( 1*10 + 4 )
         * 2th iter = 14 / 145 ( 14*10 + 5 ) // 홀수의 경우 뒤집은 것이 커짐
         *
         * e.x) 1441 ( 짝수 )
         * origin_x / revered_x
         * 0th iter = 144 / 1
         * 1th iter = 14 / 14 ( 1*10 + 4 ) ( 14 == 14 끝 )
         */

        int reverse_x = 0;
        while (reverse_x < x) {
            reverse_x = reverse_x * 10 + x % 10;
            x /= 10;
        }
        /**
         *  짝수일 때는 아예 같음 / 홀수일때는 10으로 나눔
         *  그 이유는 palindrome이라면 중간 값은 어떤 값이 들어와도 상관이 없음! ( 홀수인 경우 )
         */
        return x == reverse_x || x == reverse_x / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(14541));
    }
}
