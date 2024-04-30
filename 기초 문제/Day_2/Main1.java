package Day_2;

import java.util.Scanner;

/**
 * 코딩 기초 트레이닝 Day 2
 * 덧셈식 출력하기
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, (a + b));

        sc.close();
    }
}
