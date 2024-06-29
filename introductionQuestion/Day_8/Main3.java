import java.util.Arrays;
import java.util.HashMap;

/**
 * 코딩테스트 입문 Day 8 배열, 구현, 수학
 * 진료순서 정하기
 */
public class Main3 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{3, 76, 24});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 2, 3, 4, 5, 6, 7});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{30, 10, 23, 6, 100});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] copyArr = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(copyArr);
        int num = 1;
        for (int i = copyArr.length - 1; i >= 0; i--) {
            hm.put(copyArr[i], num++);
        }

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = hm.get(emergency[i]);
        }

        return answer;
    }
}
