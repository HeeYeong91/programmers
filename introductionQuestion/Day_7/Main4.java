import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 7 문자열, 조건문, 수학, 반복문
 * 짝수의 합
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();
    }
}
