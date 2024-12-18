package base;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer;
        /* str을 기반으로 한 문자 배열*/
        char[] s = str.toCharArray();
        /* 첫째, 마지막번째*/
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        /* static 메소드*/
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);
        String str = kd.next();
        System.out.println(T.solution(str));
    }
}