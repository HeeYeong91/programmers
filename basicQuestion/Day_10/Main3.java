/**
 * 코딩 기초 트레이닝 Day 10
 * 문자열 뒤집기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
        System.out.println(solution("49gh43jOIQvkSH", 5, 5));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        String str1 = my_string.substring(0, s);
        String str2 = my_string.substring(s, e + 1);
        sb.append(str2).reverse();
        String str3 = my_string.substring(e + 1);

        return str1 + sb + str3;
    }
}
