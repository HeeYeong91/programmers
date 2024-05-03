/**
 * 코딩 기초 트레이닝 Day 8
 * 간단한 논리 연산
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(false, true, true, true));
        System.out.println(solution(true, false, false, false));
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
