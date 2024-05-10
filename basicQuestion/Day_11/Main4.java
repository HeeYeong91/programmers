/**
 * 코딩 기초 트레이닝 Day 11
 * 카운트 다운
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(10, 3);

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static int[] solution(int start, int end_num) {
        int size = start - end_num + 1;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = start--;
        }

        return answer;
    }
}
