/**
 * 코딩 기초 트레이닝 Day 21
 * 문자열 정수의 합
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }

    public static int solution(String num_str) {
        int answer = 0;

        String[] strArr = num_str.split("");
        for (String s : strArr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
