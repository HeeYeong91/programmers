/**
 * 코딩 기초 트레이닝 Day 4
 * flag에 따라 다른 값 반환하기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
