/**
 * 코딩테스트 입문 Day 17 문자열, 수학, 조건문, 배열, 사칙연산
 * OX퀴즈
 */
public class Main4 {
    public static void main(String[] args) {
        String[] result = solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] strArr = quiz[i].split(" ");

            if (strArr[1].equals("+")) {
                if (Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]) == Integer.parseInt(strArr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (strArr[1].equals("-")) {
                if (Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]) == Integer.parseInt(strArr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}
