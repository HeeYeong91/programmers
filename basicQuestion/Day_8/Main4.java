/**
 * 코딩 기초 트레이닝 Day 8
 * 9로 나눈 나머지
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("123"));
        System.out.println(solution("78720646226947352489"));
    }

    public static int solution(String number) {
        int answer = 0;

        for (char c : number.toCharArray()) {
            answer += (c - '0');
        }

        return answer % 9;
    }
}
