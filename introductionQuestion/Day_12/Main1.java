/**
 * 코딩테스트 입문 Day 12 문자열, 정렬, 사칙연산, 수학
 * 모음 제거
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }

    public static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
