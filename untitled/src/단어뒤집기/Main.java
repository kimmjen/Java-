package 단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        /* 1. StringBuilder*/
//        for (String x: str) {
//            /* new 객체 생성, */
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        /* 2. 직접 뒤집기.*/
        for (String x : str) {
            /* 문자 배열로 변경해주기.*/
            char[] s = x.toCharArray();
            /* 중요 */
            int lt = 0, rt=x.length()-1;
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp =  String.valueOf(s);
            answer.add(tmp);

        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x: T.solution(n, str)) {
            System.out.println(x);
        }

    }
}
