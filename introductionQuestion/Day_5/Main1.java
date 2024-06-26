/**
 * 코딩테스트 입문 Day 5 수학, 배열
 * 옷가게 할인 받기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }

    public static int solution(int price) {
        if (price >= 500_000) {
            price = (int) (price * 0.8);
        } else if (price >= 300_000) {
            price = (int) (price * 0.9);
        } else if (price >= 100_000) {
            price = (int) (price * 0.95);
        }

        return price;
    }
}
