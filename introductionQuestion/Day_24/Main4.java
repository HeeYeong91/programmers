/**
 * 코딩테스트 입문 Day 24 수학, 시뮬레이션, 문자열, 조건문, 반복문
 * k의 개수
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            String[] strArr = String.valueOf(l).split("");
            for (String s : strArr) {
                if (s.equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
