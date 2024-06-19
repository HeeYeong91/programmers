/**
 * 코딩 기초 트레이닝 Day 23
 * 주사위 게임 1
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(6, 1));
        System.out.println(solution(2, 4));
    }

    public static int solution(int a, int b) {
        int answer = 0;

        if (a % 2 != 0 && b % 2 != 0) {
            answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }

        return answer;
    }
}
