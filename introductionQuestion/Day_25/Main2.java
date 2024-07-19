/**
 * 코딩테스트 입문 Day 25 시뮬레이션, 조건문, 수학
 * 종이 자르기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(2, 2));
        System.out.println(solution(2, 5));
        System.out.println(solution(1, 1));
    }

    public static int solution(int M, int N) {
        return M * N - 1;
    }
}
