/**
 * 코딩테스트 입문 Day 4 수학, 배열
 * 피자 나눠 먹기 (3)
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(7, 10));
        System.out.println(solution(4, 12));
    }

    public static int solution(int slice, int n) {
        int answer = 0;

        for (int i = 1; i <= 50; i++) {
            if (slice * i >= n) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
