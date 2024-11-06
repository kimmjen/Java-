package 숫자만추출;

import java.util.Scanner;

public class Main {

    public int solution(String str) {
        /* 1. 아스키*/
        /*int answer = 0;
        for (char x : str.toCharArray()) {
            if ( x >= 48 && x <= 57) answer = answer * 10 + (x-48);
        }*/
        /*2. isdigit*/
        String answer ="";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);
        String str = kd.next();
        System.out.println(T.solution(str));
    }
}
