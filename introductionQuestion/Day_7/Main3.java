/**
 * 코딩테스트 입문 Day 7 문자열, 조건문, 수학, 반복문
 * 양꼬치
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        int food = 12000;
        int drink = 2000;
        int service = n / 10;
        k -= service;

        return (food * n) + (drink * k);
    }
}
