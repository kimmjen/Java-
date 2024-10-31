package 대소문자변환;

import java.util.Scanner;

public class Main {

    // 반환 타입을 String으로 변경
    public String solution(String str) {
        String answer = "";
        /*
        문자열 기반 리스트 만들기
        * */
//        for (char c : str.toCharArray()) {
//            // 소문자냐를 나타내는 Character
//            if (Character.isLowerCase(c))
//                answer += Character.toUpperCase(c);
//            else
//                answer += Character.toLowerCase(c);
//        }
        /* 아스키 코드 이용*/
        for (char c : str.toCharArray()) {
            /*
            (char) 형변환
            * */
            if (c >=97 && c <=122) answer += (char)(c - 32);
            else answer += (char)(c + 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);

        String str = kd.next();

        System.out.println(T.solution(str));
    }
}
