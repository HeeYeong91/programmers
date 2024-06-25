/**
 * 코딩테스트 입문 Day 4 수학, 배열
 * 피자 나눠 먹기 (1)
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        double pizza = (double) n / (double) 7;
        return pizza <= 1 ? 1 : (int) Math.ceil(pizza);
    }
}
