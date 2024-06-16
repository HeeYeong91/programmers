/**
 *  코딩 기초 트레이닝 Day 20
 *  배열의 길이에 따라 다른 연산하기
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{49, 12, 100, 276, 33}, 27);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{444, 555, 666, 777}, 100);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {
                answer[i] = i % 2 == 0 ? arr[i] + n : arr[i];
            } else {
                answer[i] = i % 2 != 0 ? arr[i] + n : arr[i];
            }
        }

        return answer;
    }
}
