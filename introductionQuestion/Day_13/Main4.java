import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 13 문자열, 배열, 사칙연산, 수학, 조건문
 * 삼각형의 완성조건 (1)
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 6, 2}));
        System.out.println(solution(new int[]{199, 72, 222}));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[2] < sides[1] + sides[0] ? 1 : 2;
    }
}
