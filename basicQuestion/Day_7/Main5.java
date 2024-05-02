package Day_7;

import java.util.Stack;

/**
 * 코딩 기초 트레이닝 Day 7
 * 배열 만들기 4
 */
public class Main5 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int[] result = solution(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() < arr[i]) {
                stack.push(arr[i]);
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
                i--;
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
