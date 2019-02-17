package main.sort;

/**
 * Created by JAESANG_MON on 2019-02-17.
 */
public class MergeSort {

    public static void main(String[] args) {
        int input[] = {7, 6, 5, 8, 3, 5, 9, 1};
        for(int ret : input)
            System.out.print(ret +" ");
        System.out.println();

        mergeSort(input, 0, input.length - 1);
        for(int ret : input)
            System.out.print(ret +" ");
        System.out.println();
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); // 왼쪽 분할
            mergeSort(arr, mid + 1, right); // 오른쪽 분할
            merge(arr, left, mid, right);
        }
        // 하나 남으면 그냥 버림, 즉 비교 대상이 2개이상일 떄 , merge 함수 호출
    }


    public static void merge(int arr[], int left, int mid, int right) {

        int temp_sorted[] = new int[arr.length];
        int i = left; // 합칠 왼쪽편의 배열 위치
        int j = mid + 1; // 합칠 오른쪽편의 배열 위치
        int k = left; // 정렬된 후, 합칠 임시 배열의 인덱스

        while (i <= mid && j <= right) { // 왼쪽은 중간까지, 오른쪽은 맨끝인덱스까지 확인
            if (arr[i] <= arr[j])
                temp_sorted[k++] = arr[i++];
            else
                temp_sorted[k++] = arr[j++];
        }
        //무조건 한쪽은 정렬되지않고 남는 상황이 발생

        if (i > mid) // 왼쪽 배열은 다 넣었고, 오른쪽 배열에 남아있는 데이터를 저장하자
            for (int t = j; t <= right; t++)
                temp_sorted[k++] = arr[t];
        /**
         * while ( i<=mid )
         *      temp_sorted[k++] = arr[i++];
         */

        if (j > right) // 위의 반대, 왼쪽 배열에 남은 데이터 저장
            for (int t = i; t <= mid; t++)
                temp_sorted[k++] = arr[t];
        /**
         * while( j <= right )
         *      temp_sorted[k++] = arr[j++];
         */

        for( int x = left ;x <=right ;x++){ // 정렬된 데이터를 다시, 원본 input에 update
            arr[x] = temp_sorted[x];
        }

        System.out.print("PRECESS :: ");
        for(int ret : arr)
            System.out.print(ret +" ");
        System.out.println();
    }
}
