package Array.보이는학생;

import java.util.Scanner;

public class Main {

    public static int visibleStudents(int[] arr) {
        int count = 1; // 첫 번째 학생은 항상 보이므로 1로시작
        int maxHeight = arr[0]; // 첫 번째 학생의 키로 초기화

        // 두 번째 학생부터 마지막 학생까지 순회
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxHeight) { // 현재 학생이 더 크면
                count++; // 보이는 학생 수 증가
                maxHeight = arr[i]; // 최대 키 업데이트
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(visibleStudents(arr));
    }
}
