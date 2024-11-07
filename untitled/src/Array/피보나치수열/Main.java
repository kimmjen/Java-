package Array.피보나치수열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> fibonacci(int N) {
        List<Integer> sequence = new ArrayList<>();

        sequence.add(1);
        sequence.add(1);

        for (int i = 2; i < N; i++) {
            int next = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(next);
        }
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> result = fibonacci(N);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) { // 마지막 항이 아닌 경우에만 공백 추가
                System.out.print(" ");
            }
        }
    }
}
