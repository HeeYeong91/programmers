/**
 * 코딩 기초 트레이닝 Day 3
 * 더 크게 합치기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));
    }

    public static int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        answer = Math.max(Integer.parseInt(strA + strB), Integer.parseInt(strB + strA));

        return answer;
    }
}
