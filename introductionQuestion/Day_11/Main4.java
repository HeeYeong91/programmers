/**
 * 코딩테스트 입문 Day 11 수학, 반복문
 * 팩토리얼
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int answer = 0;
        int num = 1;
        int k = 1;

        while (true) {
            num *= k;

            if (num > n) {
                answer = k;
                break;
            }

            k++;
        }

        return answer - 1;
    }
}
