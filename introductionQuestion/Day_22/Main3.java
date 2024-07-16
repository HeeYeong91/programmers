/**
 * 코딩테스트 입문 Day 22 dp, 수학, 조건문, 배열
 * 겹치는 선분의 길이
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }

    public static int solution(int[][] lines) {
        int[] cnt = new int[200];

        for (int[] line : lines) {
            for (int i = line[0] + 100; i < line[1] + 100; i++) {
                cnt[i]++;
            }
        }

        int answer = 0;
        for (int num : cnt) {
            if (num > 1) {
                answer++;
            }
        }

        return answer;
    }
}
