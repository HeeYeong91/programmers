import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 19 문자열, 배열, 조건문
 * 중복된 숫자 개수
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution(new int[]{0, 2, 3, 4}, 1));
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(e -> e == n).count();
    }
}
