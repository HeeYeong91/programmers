import java.util.Hashtable;

/**
 *  코딩 기초 트레이닝 Day 20
 *  문자열 묶기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "bc", "d", "efg", "hi"}));
    }

    public static int solution(String[] strArr) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int maxCnt = 0;

        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();

            if (!ht.containsKey(len)) {
                ht.put(len, 1);
            } else {
                ht.replace(len, ht.get(len) + 1);
            }
        }

        for (int value : ht.values()) {
            maxCnt = Math.max(maxCnt, value);
        }

        return maxCnt;
    }
}
