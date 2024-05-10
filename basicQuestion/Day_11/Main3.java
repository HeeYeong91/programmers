/**
 * 코딩 기초 트레이닝 Day 11
 * 글자 지우기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }

    public static String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}
