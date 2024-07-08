import java.util.*;

/**
 * 코딩테스트 입문 Day 15 문자열, 해시, 배열, 수학
 * 한 번만 등장한 문자
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }

    public static String solution(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String[] strArr = s.split("");
        for (String str: strArr) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }

        List<String> keyList = new ArrayList<>(hashMap.keySet());
        keyList.sort(Comparator.naturalOrder());
        for (String key : keyList) {
            if (hashMap.get(key) == 1) {
                sb.append(key);
            }
        }

        return sb.toString();
    }
}
