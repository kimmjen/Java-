package 문장속단어;

import java.util.Scanner;

public class Web {

    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;
        return answer;
    }
    public static void main(String[] args) {
        Web T = new Web();
        Scanner kd = new Scanner(System.in);
        String str = kd.nextLine();
        System.out.println(T.solution(str));
    }
}
