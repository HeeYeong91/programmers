package Day_6;

/**
 * 코딩 기초 트레이닝 Day 6
 * 수 조작하기 1
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }

    public static int solution(int n, String control) {

        for (String s : control.split("")) {
            if (s.equals("w")) {
                n += 1;
            } else if (s.equals("s")) {
                n -= 1;
            } else if (s.equals("d")) {
                n += 10;
            } else if (s.equals("a")) {
                n -= 10;
            }
        }

        return n;
    }
}
