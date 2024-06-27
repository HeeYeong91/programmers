/**
 * 코딩테스트 입문 Day 6 문자열, 반복문, 출력, 배열, 조건문
 * 문자 반복 출력하기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = my_string.split("");
        for (String s: strArr) {
            sb.append(s.repeat(n));
        }

        return sb.toString();
    }
}
