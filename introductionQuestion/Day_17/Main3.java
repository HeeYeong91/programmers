import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 17 문자열, 수학, 조건문, 배열, 사칙연산
 * 자릿수 더하기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }

    public static int solution(int n) {
        String[] strArr = String.valueOf(n).split("");
        return Arrays.stream(strArr).mapToInt(Integer::parseInt).sum();
    }
}
