/**
 * 코딩 기초 트레이닝 Day 12
 * 첫 번째로 나오는 음수
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
        System.out.println(solution(new int[]{13, 22, 53, 24, 15, 6}));
    }

    public static int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
