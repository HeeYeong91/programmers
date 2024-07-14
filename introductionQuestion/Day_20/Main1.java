/**
 * 코딩테스트 입문 Day 20 수학, 시뮬레이션, 문자열, 사칙연산
 * 직사각형 넓이 구하기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }

    public static int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) {
                w = Math.abs(x - dots[i][0]);
            }

            if (y != dots[i][1]) {
                h = Math.abs(y - dots[i][1]);
            }
        }

        return w * h;
    }
}
