/**
 * 코딩테스트 입문 Day 24 수학, 시뮬레이션, 문자열, 조건문, 반복문
 * 치킨 쿠폰
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int tmp = chicken % 10;
            chicken /= 10;
            answer += chicken;
            chicken += tmp;
        }

        return answer;
    }
}
