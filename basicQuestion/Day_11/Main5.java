/**
 * 코딩 기초 트레이닝 Day 11
 * 가까운 1 찾기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0, 1}, 1));
        System.out.println(solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(solution(new int[]{1, 1, 1, 1, 0}, 3));
    }

    public static int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
