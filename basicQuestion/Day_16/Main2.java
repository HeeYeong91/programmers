/**
 * 코딩 기초 트레이닝 Day 16
 * 소문자로 바꾸기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("aaa"));
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }
}
