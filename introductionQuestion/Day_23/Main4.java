/**
 * 코딩테스트 입문 Day 23 배열, 정렬, 문자열
 * 로그인 성공?
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"meosseugi", "1234"},
                new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}
        ));
        System.out.println(solution(
                new String[]{"programmer01", "15789"},
                new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}
        ));
        System.out.println(solution(
                new String[]{"rabbit04", "98761"},
                new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}
        ));
    }

    public static String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id)) {
                if (db[i][1].equals(pw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}
