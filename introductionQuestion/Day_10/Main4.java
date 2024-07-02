/**
 * 코딩테스트 입문 Day 10 조건문, 배열, 수학, 시뮬레이션
 * 배열 회전시키기
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3}, "right");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[numbers.length - 1];
        } else {
            for (int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }
            answer[numbers.length - 1] = numbers[0];
        }

        return answer;
    }
}
