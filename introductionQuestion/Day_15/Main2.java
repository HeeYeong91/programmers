/**
 * 코딩테스트 입문 Day 15 문자열, 해시, 배열, 수학
 * 인덱스 바꾸기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("l love you", 3, 6));
    }

    public static String solution(String my_string, int num1, int num2) {
        String[] strArr = my_string.split("");
        String tmp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = tmp;

        return String.join("", strArr);
    }
}
