/**
 * 코딩테스트 입문 Day 17 문자열, 수학, 조건문, 배열, 사칙연산
 * 숫자 찾기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, 7));
    }

    public static int solution(int num, int k) {
        int answer = -1;
        String[] strArr = String.valueOf(num).split("");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(String.valueOf(k))) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
