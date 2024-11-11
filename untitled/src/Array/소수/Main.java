package Array.소수;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;
        /* 체크 배열 n번의 인덱스까지 해야*/
        int[] ch = new int[n+1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                /* i의 배수로 for문*/
                for (int j = i; j <= n; j = j+i) ch[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
