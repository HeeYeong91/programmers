/**
 * 코딩 기초 트레이닝 Day 3
 * 문자열 곱하기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("string", 3));
        System.out.println(solution("love", 10));
    }

    public static String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;
    }
}
