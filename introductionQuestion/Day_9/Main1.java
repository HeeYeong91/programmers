/**
 * 코딩테스트 입문 Day 9 수학, 문자열, 해시, 완전탐색, 조건문
 * 개미 군단
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int worker = 1;

        while (hp > 0) {
            if (hp >= general) {
                hp -= general;
                answer++;
            } else if (hp >= soldier) {
                hp -= soldier;
                answer++;
            } else {
                hp -= worker;
                answer++;
            }
        }

        return answer;
    }
}
