import java.util.HashMap;

/**
 * 코딩테스트 입문 Day 9 수학, 문자열, 해시, 완전탐색, 조건문
 * 가위 바위 보
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("2", "0");
        hm.put("0", "5");
        hm.put("5", "2");

        String[] rspArr = rsp.split("");
        for (String s: rspArr) {
            sb.append(hm.get(s));
        }
        return sb.toString();
    }
}
