import java.math.BigInteger;

/**
 * 코딩 기초 트레이닝 Day 22
 * 두 수의 합
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("582", "734"));
        System.out.println(solution("18446744073709551615", "287346502836570928366"));
        System.out.println(solution("0", "0"));
    }

    public static String solution(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);

        BigInteger sum = bigInteger1.add(bigInteger2);

        return String.valueOf(sum);
    }
}
