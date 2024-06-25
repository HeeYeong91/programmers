/**
 * 코딩테스트 입문 Day 4 수학, 배열
 * 피자 나눠 먹기 (2)
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 100; i++) {
            if ((6 * i) % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
