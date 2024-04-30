package Day_5;

/**
 * 코딩 기초 트레이닝 Day 5
 * 주사위 게임 2
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;
        int square = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int cube = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a != b && a != c && b != c) {
            answer = a + b + c;
        } else if (a == b && a != c || a == c && a != b || b == c && a != b) {
            answer = (a + b + c) * square;
        } else if (a == b && a == c) {
            answer = (a + b + c) * square * cube;
        }

        return answer;
    }
}
