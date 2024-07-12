/**
 * 코딩테스트 입문 Day 19 문자열, 배열, 조건문
 * 7의 개수
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }

    public static int solution(int[] array) {
        int answer = 0;

        for (int num : array) {
            String[] strArr = String.valueOf(num).split("");

            for (String s : strArr) {
                if (s.contains("7")) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
