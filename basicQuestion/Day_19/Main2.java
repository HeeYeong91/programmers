import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 19
 * 배열의 원소만큼 추가하기
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{5, 1, 4});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{6, 6});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
