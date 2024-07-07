/**
 * 코딩테스트 입문 Day 14 조건문, 반복문, 시뮬레이션, 문자열
 * 대문자와 소문자
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

     public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = my_string.toCharArray();

        for (char c : charArr) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
     }
}
