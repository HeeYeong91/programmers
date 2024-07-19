/**
 * 코딩테스트 입문 Day 25 시뮬레이션, 조건문, 수학
 * 다음에 올 숫자
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{2, 4, 8}));
    }

    public static int solution(int[] common) {
        int answer = 0;
        int diff = 0;
        int lastNum = common[common.length - 1];

        if (common[1] - common[0] == common[2] - common[1]) {
            diff = common[1] - common[0];
            answer = lastNum + diff;
        } else {
            diff = common[1] / common[0];
            answer = lastNum * diff;
        }

        return answer;
    }
}
