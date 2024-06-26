/**
 * 코딩테스트 입문 Day 5 수학, 배열
 * 나이 출력
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(40));
        System.out.println(solution(23));
    }

    public static int solution(int age) {
        int year = 2022;
        return year - age + 1;
    }
}
