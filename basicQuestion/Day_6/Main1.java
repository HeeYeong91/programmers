package Day_6;

/**
 * 코딩 기초 트레이닝 Day 6
 * 마지막 두 원소
 */
public class Main1 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] result = solution(num_list);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] num_list1 = {5, 2, 1, 7, 5};
        result = solution(num_list1);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int tmp = num_list[num_list.length - 1] - num_list[num_list.length - 2];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        answer[num_list.length] = (tmp > 0) ? tmp : (num_list[num_list.length - 1] * 2);

        return answer;
    }
}
