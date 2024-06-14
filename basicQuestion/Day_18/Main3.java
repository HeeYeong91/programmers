/**
 * 코딩 기초 트레이닝 Day 18
 * 간단한 식 계산하기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

    public static int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");

        int a = Integer.parseInt(strArr[0]);
        String op = strArr[1];
        int b = Integer.parseInt(strArr[2]);

        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }

        return answer;
    }
}
