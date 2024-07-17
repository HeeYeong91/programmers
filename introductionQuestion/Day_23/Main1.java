import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 23 배열, 정렬, 문자열
 * 특이한 정렬
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);

        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)) {
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }

        return numlist;
    }
}
