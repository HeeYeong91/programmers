/**
 * 코딩테스트 입문 Day 2 사칙연산, 조건문, 배열
 * 숫자 비교하기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
