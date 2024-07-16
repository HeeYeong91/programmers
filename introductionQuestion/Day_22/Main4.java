/**
 * 코딩테스트 입문 Day 22 dp, 수학, 조건문, 배열
 * 유한소수 판별하기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(12, 21));
    }

    public static int solution(int a, int b) {
        int tmp = b / GCD(a, b);

        while (tmp != 1) {
            if (tmp % 2 == 0) {
                tmp /= 2;
            } else if (tmp % 5 == 0) {
                tmp /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    public static int GCD (int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
