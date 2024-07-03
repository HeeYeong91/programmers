/**
 * 코딩테스트 입문 Day 11 수학, 반복문
 * 합성수 찾기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }

                if (cnt >= 3) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
