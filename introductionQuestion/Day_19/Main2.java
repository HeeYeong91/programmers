/**
 * 코딩테스트 입문 Day 19 문자열, 배열, 조건문
 * 잘라서 배열로 저장하기
 */
public class Main2 {
    public static void main(String[] args) {
        String[] result = solution("abc1Addfggg4556b", 6);
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution("abcdef123", 3);
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String my_str, int n) {
        int size = (my_str.length() % n) == 0 ? my_str.length() / n : (my_str.length() / n) + 1;
        String[] answer = new String[size];
        int idx = 0;

        for (int i = 0; i < answer.length; i++) {
            if (idx + n < my_str.length()) {
                answer[i] = my_str.substring(idx, idx + n);
            } else {
                answer[i] = my_str.substring(idx);
            }

            idx += n;
        }

        return answer;
    }
}
