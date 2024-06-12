/**
 * 코딩 기초 트레이닝 Day 16
 * 배열에서 문자열 대소문자 변환하기
 */
public class Main3 {
    public static void main(String[] args) {
        String[] result = solution(new String[]{"AAA", "BBB", "CCC", "DDD"});

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution(new String[]{"aBc", "AbC"});

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
}
