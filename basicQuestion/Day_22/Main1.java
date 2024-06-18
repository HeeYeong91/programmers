/**
 * 코딩 기초 트레이닝 Day 22
 * 0 떼기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }

    public static String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }
}
