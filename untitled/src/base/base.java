package base;

import java.util.Scanner;

public class base {

    public String solution(String str) {
        String answer = "";
        /* 아스키 코드 이용 */
        for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122) // 소문자
                answer += (char)(c - 32); // 대문자로 변환
            else if (c >= 65 && c <= 90) // 대문자
                answer += (char)(c + 32); // 소문자로 변환
            else
                answer += c; // 다른 문자는 그대로 추가
        }
        return answer;
    }

    public static void main(String[] args) {
        base T = new base();
        Scanner kd = new Scanner(System.in);
        String str = kd.next();
        System.out.println(T.solution(str));
    }
}