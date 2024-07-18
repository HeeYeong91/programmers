/**
 * 코딩테스트 입문 Day 24 수학, 시뮬레이션, 문자열, 조건문, 반복문
 * 이진수 더하기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("10", "11"));
        System.out.println(solution("1001", "1111"));
    }

    public static String solution(String bin1, String bin2) {
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(sum);
    }
}
