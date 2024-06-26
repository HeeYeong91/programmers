/**
 * 코딩테스트 입문 Day 5 수학, 배열
 * 아이스 아메리카노
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(5500);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(15000);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int money) {
        int[] answer = new int[2];

        int price = 5500;
        int cnt = money / price;
        int changes = money - (price * cnt);

        answer[0] = cnt;
        answer[1] = changes;

        return answer;
    }
}
