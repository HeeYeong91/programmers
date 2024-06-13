/**
 * 코딩 기초 트레이닝 Day 17
 * 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }

    public static String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        return myString.substring(0, idx + pat.length());
    }
}
