/**
 * 코딩 기초 트레이닝 Day 4
 * 조건 문자열
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        boolean result = false;
        String s = ineq + eq;

        if (s.equals(">=")) {
            result = n >= m;
        } else if (s.equals("<=")) {
            result = n <= m;
        } else if (s.equals(">!")) {
            result = n > m;
        } else if (s.equals("<!")) {
            result = n < m;
        }

        return result ? 1 : 0;
    }
}
