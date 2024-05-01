package Day_4;

/**
 * 코딩 기초 트레이닝 Day 4
 * n의 배수
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(98, 2));
        System.out.println(solution(34, 3));
    }

    public static int solution(int num, int n) {
        return (num % n == 0) ? 1 : 0;
    }
}
