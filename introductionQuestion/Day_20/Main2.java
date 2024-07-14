/**
 * 코딩테스트 입문 Day 20 수학, 시뮬레이션, 문자열, 사칙연산
 * 캐릭터의 좌표
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        for (String s : keyinput) {
            if (s.equals("up") && answer[1] < (board[1] / 2)) {
                answer[1]++;
            } else if (s.equals("down") && answer[1] > (board[1] / -2)) {
                answer[1]--;
            } else if (s.equals("left") && answer[0] > (board[0] / -2)) {
                answer[0]--;
            } else if (s.equals("right") && answer[0] < (board[0] / 2)) {
                answer[0]++;
            }
        }

        return answer;
    }
}
