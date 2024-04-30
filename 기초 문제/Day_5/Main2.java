package Day_5;

/**
 * 코딩 기초 트레이닝 Day 5
 * 등차수열의 특정한 항만 더하기
 */
public class Main2 {
    public static void main(String[] args) {
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(3, 4, included));

        boolean[] included2 = {false, false, false, true, false, false, false};
        System.out.println(solution(7, 1, included2));
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (i > 0) {
                a += d;
            }

            if (included[i]) {
                answer += a;
            }
        }

        return answer;
    }
}
