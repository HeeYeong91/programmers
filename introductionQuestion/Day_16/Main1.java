/**
 * 코딩테스트 입문 Day 16 문자열, 수학, 배열, 조건문
 * 편지
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    public static int solution(String message) {
        int size = 2;
        return message.length() * size;
    }
}
