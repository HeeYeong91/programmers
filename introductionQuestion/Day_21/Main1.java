import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 21 문자열, 사칙연산, 시뮬레이션, 2차원배열, 수학, 배열
 * 숨어있는 숫자의 덧셈 (2)
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    public static int solution(String my_string) {
        return Arrays.stream(my_string.split("[a-zA-Z]+"))
                     .filter(e -> !e.isEmpty())
                     .mapToInt(Integer::parseInt)
                     .sum();
    }
}
