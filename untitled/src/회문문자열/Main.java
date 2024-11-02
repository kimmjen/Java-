package 회문문자열;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        /*직접 비교*/
        /*String answer = "YES";*/
        /*str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) return "NO";
        }*/
        /* StringBuilder 이용 */
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);
        String str = kd.next();
        System.out.println(T.solution(str));
    }
}