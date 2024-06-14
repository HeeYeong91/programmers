/**
 * 코딩 기초 트레이닝 Day 18
 * rny_string
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
        System.out.println(solution("programmers"));
        System.out.println(solution("jerry"));
        System.out.println(solution("burn"));
    }

    public static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
