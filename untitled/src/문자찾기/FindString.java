package 문자찾기;

import com.sun.tools.javac.Main;

import java.util.Scanner;

class FindString {

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindString T = new FindString();
        Scanner kd = new Scanner(System.in);

        String str = kd.next();
        char c = kd.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
