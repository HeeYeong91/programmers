/**
 * 코딩 기초 트레이닝 Day 14
 * n보다 커질 때까지 더하기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(solution(new int[]{58, 44, 27, 10, 100}, 139));
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (answer <= n) {
                answer += numbers[i];
            }
        }

        return answer;
    }
}
