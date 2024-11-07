package Array.가위바위보;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<String> solution(int N, int[] A, int[] B) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                list.add("D");
            } else if ((A[i] == 1 && B[i] == 3) ||
                    (A[i] == 2 && B[i] == 1) ||
                    (A[i] == 3 && B[i] == 2)) {
                list.add("A");
            } else {
                list.add("B");
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        List<String> results = solution(N, A, B);

        for (String result : results) {
            System.out.println(result);
        }
    }
}
