/**
 * 코딩테스트 입문 Day 21 문자열, 사칙연산, 시뮬레이션, 2차원배열, 수학, 배열
 * 삼각형의 완성조건 (2)
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{3, 6}));
        System.out.println(solution(new int[]{11, 7}));
    }

    public static int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        int maxValue = max + min;
        int minValue = max - min;

        return maxValue - minValue - 1;
    }
}
