/**
 * 코딩 기초 트레이닝 Day 16
 * 특정한 문자를 대문자로 바꾸기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution("programmers", "p"));
        System.out.println(solution("lowercase", "x"));
    }

    public static String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
