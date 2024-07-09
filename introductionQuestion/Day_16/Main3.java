/**
 * 코딩테스트 입문 Day 16 문자열, 수학, 배열, 조건문
 * 문자열 계산하기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        answer += Integer.parseInt(strArr[0]);

        for (int i = 1; i < strArr.length - 1; i++) {
            if (strArr[i].equals("+")) {
                answer += Integer.parseInt(strArr[i + 1]);
            } else if (strArr[i].equals("-")) {
                answer -= Integer.parseInt(strArr[i + 1]);
            }
        }

        return answer;
    }
}
