/**
 * 코딩 기초 트레이닝 Day 15
 * 조건에 맞게 수열 변환하기 1
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 100, 99, 98});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0){
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}
