/**
 * 코딩 기초 트레이닝 Day 9
 * 문자열의 뒤의 n글자
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
        System.out.println(solution("He110W0r1d", 5));
    }

    public static String solution(String my_string, int n) {;
        return my_string.substring(my_string.length() - n);
    }
}
