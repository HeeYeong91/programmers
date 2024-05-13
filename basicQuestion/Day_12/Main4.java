/**
 * 코딩 기초 트레이닝 Day 12
 * 2의 영역
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 1, 4, 5, 2, 9});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 2, 1});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 1, 1});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        int[] answer;
        int minIdx = Integer.MAX_VALUE;
        int maxIdx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                minIdx = Math.min(i, minIdx);
                maxIdx = Math.max(i, maxIdx);
            }
        }

        if (minIdx != Integer.MAX_VALUE) {
            int size = maxIdx - minIdx;
            int idx = 0;
            answer = new int[size + 1];

            for (int i = minIdx; i <= maxIdx; i++) {
                if (idx > size) {
                    break;
                }

                answer[idx++] = arr[i];
            }
        } else {
            return new int[]{-1};
        }

        return answer;
    }
}
