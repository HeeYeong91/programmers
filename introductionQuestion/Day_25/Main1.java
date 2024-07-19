/**
 * 코딩테스트 입문 Day 25 시뮬레이션, 조건문, 수학
 * 문자열 밀기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
        System.out.println(solution("apple", "elppa"));
        System.out.println(solution("atat", "tata"));
        System.out.println(solution("abc", "abc"));
    }

    public static int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int len = A.length();
        int answer = 0;

        for (int i = 0; i < len; i++) {
            if (sb.toString().equals(B)) {
                return answer;
            }

            char tmp = A.charAt(len - i - 1);
            sb.deleteCharAt(len - 1);
            sb.insert(0, tmp);
            answer++;
        }

        return -1;
    }
}
