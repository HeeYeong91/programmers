/**
 * 코딩 기초 트레이닝 Day 17
 * 공백으로 구분하기 1
 */
public class Main4 {
    public static void main(String[] args) {
        String[] result = solution("i love you");

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution("programmers");

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
