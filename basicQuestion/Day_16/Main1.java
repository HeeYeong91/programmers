/**
 * 코딩 기초 트레이닝 Day 16
 * 대문자로 바꾸기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("AAA"));
    }

    public static String solution(String myString) {
        return myString.toUpperCase();
    }
}
