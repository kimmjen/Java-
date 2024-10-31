package 문장속단어;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        /* 1.*/
//        /* 최대값으로 갱신 해야하는곳 */
//        int m = Integer.MIN_VALUE;
//        /* 문장을 분리하는 곳 = split*/
//        String[] s = str.split(" ");
//        /* 프린트 */
//        for (String x: s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
        /* 2. indexOf pos: 정수 변수, substring*/
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > m) {
                m = len;
                answer = tmp;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kd = new Scanner(System.in);

        // 예시 입력과 출력
        System.out.println("테스트 케이스 수를 입력하세요:");
        int testCaseCount = Integer.parseInt(kd.nextLine());

        String[] testInputs = new String[testCaseCount];
        String[] expectedOutputs = new String[testCaseCount];

        // 테스트 케이스 입력
        for (int i = 0; i < testCaseCount; i++) {
            System.out.print("테스트 입력 " + (i + 1) + ": ");
            testInputs[i] = kd.nextLine();
            System.out.print("예상 출력 " + (i + 1) + ": ");
            expectedOutputs[i] = kd.nextLine();
        }

        for (int i = 0; i < testCaseCount; i++) {
            String str = testInputs[i];
            String expectedOutput = expectedOutputs[i];

            System.out.println("\n예시 입력: " + str);
            System.out.println("예시 출력: " + expectedOutput);

            // 시간 측정 시작
            long startTime = System.currentTimeMillis();

            // 메모리 측정 시작
            long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            String result = T.solution(str);

            // 메모리 측정 종료
            long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long usedMemory = afterMemory - beforeMemory; // 사용된 메모리

            // 시간 측정 종료
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.println("변환 결과: " + result);
            System.out.println("정답 확인: " + (result.equals(expectedOutput) ? "🟢 정답입니다!" : "🔴 틀렸습니다!"));

            // 시간 및 메모리 제한 출력
            System.out.println("실행 시간: " + executionTime + "ms / 시간 제한: 1000ms");
            System.out.println("사용된 메모리: " + usedMemory / 1024 + "KB / 메모리 제한: 256MB");
        }

        kd.close(); // Scanner 닫기
    }
}