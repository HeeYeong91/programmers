import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 8 배열, 구현, 수학
 * 순서쌍의 개수
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(a -> n % a == 0).count();
    }
}
