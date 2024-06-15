import java.util.Stack;

/**
 * 코딩 기초 트레이닝 Day 19
 * 배열 만들기 6
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{0, 1, 1, 1, 0});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{0, 1, 0, 1, 0});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{0, 1, 1, 0});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty() || stk.peek() != arr[i]) {
                stk.push(arr[i]);
            } else if (stk.peek() == arr[i]) {
                stk.pop();
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
