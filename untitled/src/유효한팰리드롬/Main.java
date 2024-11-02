package 유효한팰리드롬;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "NO";
        /* 대문자 A-Z가 아니면, ^=부정*/
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);
        String str = kd.nextLine();
        System.out.println(T.solution(str));
    }
}
