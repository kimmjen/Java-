package String.암호;

import java.util.Scanner;

public class Main {


    public String decode(int n, String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // 7자리씩 잘라냄
            String segment = s.substring(i * 7, (i + 1) * 7);
            // #을 1로, *을 0으로 변환하여 이진수 문자열 생성
            String binaryString = segment.replace('#', '1').replace('*', '0');
            // 이진수 문자열을 10진수로 변환
            int decimal = Integer.parseInt(binaryString, 2);
            // 아스키 코드 값을 문자로 변환하여 결과에 추가
            result.append((char) decimal);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 문자의 개수
        String s = scanner.next(); // String.암호 문자열
        System.out.println(T.decode(n, s));
    }
}
