/**
 * 코딩테스트 입문 Day 21 문자열, 사칙연산, 시뮬레이션, 2차원배열, 수학, 배열
 * 외계어 사전
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public static int solution(String[] spell, String[] dic) {
        boolean match = false;

        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;

            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    cnt++;
                }
            }

            if (cnt == spell.length) {
                match = true;
            }
        }

        return match ? 1 : 2;
    }
}
