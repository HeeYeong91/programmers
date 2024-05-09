/**
 * 코딩 기초 트레이닝 Day 10
 * qr code
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(solution(1, 0, "programmers"));
    }

    public static String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer += code.charAt(i);
            }
        }

        return answer;
    }
}
