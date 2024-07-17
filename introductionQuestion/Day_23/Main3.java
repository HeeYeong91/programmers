/**
 * 코딩테스트 입문 Day 23 배열, 정렬, 문자열
 * 옹알이 (1)
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (String s : arr) {
                babbling[i] = babbling[i].replace(s, " ");
            }

            if (babbling[i].trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
