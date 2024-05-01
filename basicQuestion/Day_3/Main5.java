package Day_3;

/**
 * 코딩 기초 트레이닝 Day 3
 * 두 수의 연산값 비교하기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }

    public static int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        answer = Math.max(Integer.parseInt(strA + strB), (2 * a * b));

        return answer;
    }
}
