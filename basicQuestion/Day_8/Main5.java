/**
 * 코딩 기초 트레이닝 Day 8
 * 문자열 여러 번 뒤집기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string);

        for (int i = 0; i < queries.length; i++) {
            StringBuilder sb = new StringBuilder();
            int s = queries[i][0];
            int e = queries[i][1];

            String tmp = answer.substring(s, e + 1);
            sb.append(tmp).reverse();
            answer.replace(s, e + 1, sb.toString());
        }

        return answer.toString();
    }
}
