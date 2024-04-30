package Day_1;

import java.util.Scanner;

/**
 * 코딩 기초 트레이닝 Day 1
 * 문자열 반복해서 출력하기
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        str = str.repeat(n);
        System.out.println(str);

        sc.close();
    }
}
