/**
 * 코딩테스트 입문 Day 2 사칙연산, 조건문, 배열
 * 두 수의 나눗셈
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));
    }

    public static int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;

        return (int) answer;
    }
}
