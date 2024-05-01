package Day_6;

/**
 * 코딩 기초 트레이닝 Day 6
 * 수 조작하기 2
 */
public class Main3 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }

    public static String solution(int[] numLog) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < numLog.length - 1; i++) {
            int tmp = numLog[i + 1] - numLog[i];

            if (tmp == 1) {
                sb.append("w");
            } else if (tmp == -1) {
                sb.append("s");
            } else if (tmp == 10) {
                sb.append("d");
            } else if (tmp == -10) {
                sb.append("a");
            }
        }

        return sb.toString();
    }
}
