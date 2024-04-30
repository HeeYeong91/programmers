/**
 * 코딩 기초 트레이닝 Day 5
 * 코드 처리하기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }

    public static String solution(String code) {
        int mode = 0;
        StringBuffer sb = new StringBuffer();

        String[] codeSplit = code.split("");

        for (int i = 0; i < codeSplit.length; i++) {
            if (mode == 0) {
                if (i % 2 == 0 && !codeSplit[i].equals("1")) {
                    sb.append(codeSplit[i]);
                } else if (codeSplit[i].equals("1")) {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (i % 2 != 0 && !codeSplit[i].equals("1")) {
                    sb.append(codeSplit[i]);
                } else if (codeSplit[i].equals("1")) {
                    mode = 0;
                }
            }
        }

        return !sb.toString().isEmpty() ? sb.toString() : sb.append("EMPTY").toString();
    }
}
