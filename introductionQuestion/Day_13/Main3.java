/**
 * 코딩테스트 입문 Day 13 문자열, 배열, 사칙연산, 수학, 조건문
 * 중복된 문자 제거
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }

    public static String solution(String my_string) {
        String answer = "";

        String[] strArr = my_string.split("");
        for (int i = 0; i < strArr.length; i++) {
            if (!answer.contains(strArr[i])) {
                answer += strArr[i];
            }
        }

        return answer;
    }
}
