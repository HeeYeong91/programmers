package Day_1;

import java.util.Scanner;

/**
 * 코딩 기초 트레이닝 Day 1
 * 대소문자 바꿔서 출력하기
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        int step = 'a' - 'A';

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                sb.append((char) (a.charAt(i) - step));
            } else {
                sb.append((char) (a.charAt(i) + step));
            }
        }
        System.out.println(sb);

        sc.close();
    }
}
