/**
 * 코딩 기초 트레이닝 Day 16
 * A 강조하기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }

    public static String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = myString.split("");

        for (String s : strArr) {
            if (s.equalsIgnoreCase("a")) {
                sb.append(s.toUpperCase());
            } else {
                sb.append(s.toLowerCase());
            }
        }

        return sb.toString();
    }
}
