import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 19 문자열, 배열, 조건문
 * 머쓱이보다 키 큰 사람
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(solution(new int[]{180, 120, 140}, 190));
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(e -> e > height).count();
    }
}
