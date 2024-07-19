/**
 * 코딩테스트 입문 Day 25 시뮬레이션, 조건문, 수학
 * 연속된 수의 합
 */
public class Main3 {
    public static void main(String[] args) {
        int[] result = solution(3, 12);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(5, 15);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(4, 14);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(5, 5);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            total -= i;
        }

        int tmp = total / num;

        for (int i = 0; i < num; i++) {
            answer[i] = tmp + i;
        }

        return answer;
    }
}
