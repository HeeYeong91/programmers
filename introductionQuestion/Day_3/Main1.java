/**
 * 코딩테스트 입문 Day 3 사칙연산, 배열, 수학
 * 나머지 구하기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(10, 5));
    }

    public static int solution(int num1, int num2) {
        return num1 % num2;
    }
}
