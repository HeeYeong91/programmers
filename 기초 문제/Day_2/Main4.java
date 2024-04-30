package Day_2;

import java.util.Scanner;

/**
 * 코딩 기초 트레이닝 Day 2
 * 홀짝 구분하기
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.printf("%d is even", n);
        } else {
            System.out.printf("%d is odd", n);
        }

        sc.close();
    }
}
