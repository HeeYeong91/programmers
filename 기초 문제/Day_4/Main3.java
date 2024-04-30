import java.util.stream.IntStream;

/**
 * 코딩 기초 트레이닝 Day 4
 * 홀짝에 따라 다른 값 반환하기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        IntStream range = IntStream.range(1, n + 1);

        if (n % 2 != 0) {
            answer = range.filter(a -> a % 2 != 0).sum();
        } else {
            answer = range.filter(a -> a % 2 == 0).map(a -> a * a).sum();
        }

        return answer;
    }
}
