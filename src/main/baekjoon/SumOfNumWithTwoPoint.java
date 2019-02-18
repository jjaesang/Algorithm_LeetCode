package main.baekjoon;

/**
 * Created by JAESANG_MON on 2019-02-18.
 * 문제
 * N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다.
 * 이 수열의 i번째 수부터 j번째 수까지의 합 A[i]+A[i+1]+…+A[j-1]+A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 N(1≤N≤10,000), M(1≤M≤300,000,000)이 주어진다.
 * 다음 줄에는 A[1], A[2], …, A[N]이 공백으로 분리되어 주어진다. 각각의 A[x]는 30,000을 넘지 않는 자연수이다.
 * <p>
 * 4 2
 * 1 1 1 1 --> 3
 * <p>
 * 10 5
 * 1 2 3 4 2 5 3 1 1 2 --> 3
 * <p>
 * https://www.acmicpc.net/problem/2003
 * 참고 : https://m.blog.naver.com/kks227/220795165570
 */
public class SumOfNumWithTwoPoint {
    /**
     * 채점 번호	아이디	    문제 번호	문제 제목	    결과	        메모리	    시간	언어	코드 길이
     * 11837208	    jaesang2443	2003	    수들의 합 2	    맞았습니다!!	16132kb     120	ms  Java	1194
     * @param args
     */
    public static void main(String[] args) {
/*
        int N = 10;
        int M =5;
        int[] arr = {1,2,3,4,2,5,3,1,1,2};*/

        int N = 4;
        int M =2;
        int[] arr = {1,1,1,1};
        System.out.println(solve(N,M,arr));
    }

    /**
     * 모든 부분합을 구하면 O(N^2)으로 시간 초과될 수 있음
     * 두개의 포인터변수를 이용하며 O(N)의 시간복잡도로 구현
     * @param N
     * @param M
     * @param arr
     * @return
     */
    public static int solve(int N, int M, int[] arr) {
        int result = 0;
        int start = 0;
        int end = 0;
        int sum = 0;

        while ( start < N ) {
            if (sum >= M || end == N) // end가 끝에 있을 경우 while문을 빠져나가기 위함
                sum -= arr[start++];
            else
                sum += arr[end++];

            if( sum == M)
                result++;
        }
        return result;
    }
}

