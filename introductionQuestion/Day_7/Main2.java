/**
 * 코딩테스트 입문 Day 7 문자열, 조건문, 수학, 반복문
 * 각도기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }

    public static int solution(int angle) {
        int answer = 0;

        if (angle == 180) {
            answer = 4;
        } else if (angle < 180 && angle > 90) {
            answer = 3;
        } else if (angle == 90) {
            answer = 2;
        } else {
            answer = 1;
        }

        return answer;
    }
}
