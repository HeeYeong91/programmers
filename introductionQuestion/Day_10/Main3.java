/**
 * 코딩테스트 입문 Day 10 조건문, 배열, 수학, 시뮬레이션
 * 공 던지기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
    }

    public static int solution(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }
}
