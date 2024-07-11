/**
 * 코딩테스트 입문 Day 18 문자열, 수학, 조건문, 정렬
 * 제곱수 판별하기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }

    public static int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
