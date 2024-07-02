/**
 * 코딩테스트 입문 Day 10 조건문, 배열, 수학, 시뮬레이션
 * 점의 위치 구하기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 9}));
    }

    public static int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }
}
