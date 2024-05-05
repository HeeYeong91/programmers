/**
 * 코딩 기초 트레이닝 Day 9
 * 접미사인지 확인하기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "wxyz"));
        System.out.println(solution("banana", "abanana"));
    }

    public static int solution(String my_string, String is_suffix) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            String sub = my_string.substring(i);
            if (sub.equals(is_suffix)) {
                return 1;
            }
        }

        return answer;
    }
}
