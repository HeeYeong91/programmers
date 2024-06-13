/**
 * 코딩 기초 트레이닝 Day 17
 * 문자열이 몇 번 등장하는지 세기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("aaaa", "aa"));
    }

    public static int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.startsWith(pat, i)) {
                answer++;
            }
        }

        return answer;
    }
}
