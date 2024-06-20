/**
 * 코딩 기초 트레이닝 Day 24
 * 커피 심부름
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }

    public static int solution(String[] order) {
        int answer = 0;

        for (String s : order) {
            if (s.contains("americano") || s.contains("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }

        return answer;
    }
}
