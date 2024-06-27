import java.util.Scanner;

/**
 * 코딩테스트 입문 Day 6 문자열, 반복문, 출력, 배열, 조건문
 * 직각삼각형 출력하기
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
