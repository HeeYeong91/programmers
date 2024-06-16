/**
 *  코딩 기초 트레이닝 Day 20
 *  배열의 길이를 2의 거듭제곱으로 만들기
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5, 6});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{58, 172, 746, 89});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        int n = 0;

        while (arr.length > (int) Math.pow(2, n)) {
            n++;
        }

        int[] answer = new int[(int) Math.pow(2, n)];
        for (int i = 0; i < answer.length; i++) {
            if (i < arr.length) {
                    answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }
}
