/**
 * 코딩테스트 입문 Day 20 수학, 시뮬레이션, 문자열, 사칙연산
 * 다항식 더하기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
    }

    public static String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = polynomial.split(" ");

        int x = 0;
        int n = 0;
        for (String s : strArr) {
            if (s.contains("x")) {
                if (s.equals("x")) {
                    x++;
                } else {
                    x += Integer.parseInt(s.replace("x", ""));
                }
            } else if (!s.equals("+")) {
                n += Integer.parseInt(s);
            }
        }

        if (x == 1 && n == 0) {
            sb.append("x");
        } else if (x == 1) {
            sb.append("x + ").append(n);
        } else if (n == 0) {
            sb.append(x).append("x");
        } else if (x == 0) {
            sb.append(n);
        } else {
            sb.append(x).append("x + ").append(n);
        }

        return sb.toString();
    }
}
