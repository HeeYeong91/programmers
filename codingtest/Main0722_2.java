import java.util.Scanner;

/**
 * 코딩테스트 연습 PCCE 기출문제 1번
 * 피타고라스의 정리
 */
public class Main0722_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) Math.pow(c, 2) - (int) Math.pow(a, 2);

        System.out.println(b_square);
    }
}
