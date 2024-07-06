/**
 * 코딩테스트 입문 Day 13 문자열, 배열, 사칙연산, 수학, 조건문
 * 배열 원소의 길이
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(new String[]{"We", "are", "the", "world!"});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new String[]{"I", "Love", "Programmers."});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
