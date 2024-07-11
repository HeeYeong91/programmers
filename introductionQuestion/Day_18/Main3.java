/**
 * 코딩테스트 입문 Day 18 문자열, 수학, 조건문, 정렬
 * 세균 증식
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }

    public static int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }
}
