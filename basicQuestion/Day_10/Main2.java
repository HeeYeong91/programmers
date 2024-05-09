/**
 * 코딩 기초 트레이닝 Day 10
 * 접두사인지 확인하기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ban"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "abcd"));
        System.out.println(solution("banana", "bananan"));
    }

    public static int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
