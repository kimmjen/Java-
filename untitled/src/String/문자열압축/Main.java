package String.문자열압축;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                if (count > 1) result.append(count);
                count = 1;
            }
        }

        // 마지막 문자 처리
        result.append(str.charAt(str.length() - 1));
        if (count > 1) result.append(count);

        return result.toString();
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);
        String str = kd.next();
        System.out.println(T.solution(str));
    }
}
