/**
 * 코딩테스트 입문 Day 2 사칙연산, 조건문, 배열
 * 분수의 덧셈
 */
public class Main3 {
    public static void main(String[] args) {
        int[] result = solution(1, 2, 3, 4);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(9, 2, 1, 3);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd = 0;

        for (int i = 1; i <= numer && i <= denom; i++) {
            if (numer % i == 0 && denom % i == 0) {
                gcd = i;
            }
        }

        answer[0] = numer / gcd;
        answer[1] = denom / gcd;

        return answer;
    }
}
