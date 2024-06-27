/**
 * 코딩테스트 입문 Day 6 문자열, 반복문, 출력, 배열, 조건문
 * 짝수 홀수 개수
 */
public class Main3 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 3, 5, 7});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddCnt = 0;
        int evenCnt = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        answer[0] = evenCnt;
        answer[1] = oddCnt;

        return answer;
    }
}
