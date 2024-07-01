/**
 * 코딩테스트 입문 Day 9 수학, 문자열, 해시, 완전탐색, 조건문
 * 구슬을 나누는 경우의 수
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
    }

    public static int solution(int balls, int share) {
        return combination(balls, share);
    }

    private static int combination(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }

        return combination((balls - 1), (share)) + combination(balls - 1, share - 1);
    }
}
