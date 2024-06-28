/**
 * 코딩테스트 입문 Day 7 문자열, 조건문, 수학, 반복문
 * 특정 문자 제거하기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
