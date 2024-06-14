/**
 * 코딩 기초 트레이닝 Day 18
 * 문자열 바꿔서 찾기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
    }

    public static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }

        return sb.toString().contains(pat) ? 1 : 0;
    }
}
