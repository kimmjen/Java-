package String.대소문자변환;

import java.util.Scanner;

public class Main2 {

    public String solution(String str) {
        String answer = "";
        /* 아스키 코드 이용 */
        for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122) // 소문자
                answer += (char)(c - 32); // 대문자로 변환
            else if (c >= 65 && c <= 90) // 대문자
                answer += (char)(c + 32); // 소문자로 변환
            else
                answer += c; // 다른 문자는 그대로 추가
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
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