/**
 * 코딩 기초 트레이닝 Day 24
 * l로 만들기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }

    public static String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = myString.toCharArray();

        for (char c : charArr) {
            if (c < 'l') {
                sb.append('l');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
