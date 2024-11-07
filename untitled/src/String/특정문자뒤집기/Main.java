package String.특정문자뒤집기;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer;
        /* 문자 배열 생성*/
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        /* 배열 을 스트링으로 전환*/
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);
        String str = kd.nextLine();
        System.out.println(T.solution(str));
    }
}
