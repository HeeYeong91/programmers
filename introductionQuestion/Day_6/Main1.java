/**
 * 코딩테스트 입문 Day 6 문자열, 반복문, 출력, 배열, 조건문
 * 문자열 뒤집기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}
