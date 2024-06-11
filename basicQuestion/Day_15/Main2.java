import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 15
 * 조건에 맞게 수열 변환하기 2
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int[] arrX = new int[arr.length];
        boolean match = false;

        while (!match) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arrX[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arrX[i] = arr[i] * 2 + 1;
                } else {
                    arrX[i] = arr[i];
                }
            }

            answer++;
            match = Arrays.equals(arr, arrX);

            if (!match) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arrX[i];
                }
            }
        }

        return answer - 1;
    }
}
