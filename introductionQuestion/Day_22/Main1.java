/**
 * 코딩테스트 입문 Day 22 dp, 수학, 조건문, 배열
 * 저주의 숫자 3
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            do {
                answer++;
            } while (answer % 3 == 0 || String.valueOf(answer).contains("3"));
        }

        return answer;
    }
}
