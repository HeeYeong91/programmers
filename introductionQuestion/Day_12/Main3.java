/**
 * 코딩테스트 입문 Day 12 문자열, 정렬, 사칙연산, 수학
 * 숨어있는 숫자의 덧셈 (1)
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.replaceAll("[a-zA-Z]", "")
                .split("");

        for (String s : strArr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
