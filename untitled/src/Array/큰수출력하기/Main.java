package Array.큰수출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> getLargerNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();

        /* 첫 번째 수는 무조건 추가 */
        result.add(arr[0]);

        /* 두 번째 수부터 시작하여 앞의 수와 비교 */

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 정수 개수 N 입력
        int[] arr = new int[N];    // N개의 정수를 저장할 배열

        // N개의 정수를 배열에 입력
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 조건에 맞는 수를 추출하여 출력
        List<Integer> result = getLargerNumbers(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
