/**
 * 코딩 기초 트레이닝 Day 22
 * 부분 문자열인지 확인하기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "wxyz"));
    }

    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
