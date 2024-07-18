import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 24 수학, 시뮬레이션, 문자열, 조건문, 반복문
 * A로 B 만들기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return String.valueOf(beforeArr).equals(String.valueOf(afterArr)) ? 1 : 0;
    }
}
