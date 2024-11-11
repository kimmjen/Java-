package String.문자열압축;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
//        /* 첫번째 해결법 */
//        String answer = "";
//        str = str +" ";
//
//        int cnt = 1;
//        for (int i = 0; i < str.length() -1; i++) {
//            if (str.charAt(i) == str.charAt(i+1)) cnt++;
//            else {
//                answer += str.charAt(i);
//                if (cnt > 1) answer+=String.valueOf(cnt);
//                cnt = 1;
//            }
//        }
//        return answer;

        /* 두 번재 해결법*/
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                /* 문자 추가*/
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
