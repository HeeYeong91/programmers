import java.util.HashMap;
import java.util.Map;

/**
 * 코딩 기초 트레이닝 Day 8
 * 주사위 게임 3
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(2, 2, 2, 2));
        System.out.println(solution(4, 1, 4, 4));
        System.out.println(solution(6, 3, 3, 6));
        System.out.println(solution(2, 5, 2, 6));
        System.out.println(solution(6, 4, 2, 5));
    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        if (map.size() == 1) { // 네 주사위에서 나온 숫자가 모두 같을 때
            answer = a * 1111;
        } else if (map.size() == 2) {
            if (map.containsValue(3)) { // 세 주사위에서 나온 숫자가 p로 같고, 다른 주사위에서 나온 숫자가 q일 때
                for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    answer += e.getKey() * (e.getValue() == 3 ? 10 : 1);
                }

                answer = answer * answer;
            } else if (map.containsValue(2)) { // 두 주사위에서 나온 숫자가 p로 같고, 두 주사위에서 나온 숫자가 q로 같을 때
                int p = a;
                int q = 0;

                for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    if (e.getKey() != p) {
                        q = e.getKey();
                    }
                }

                answer = (p + q) * Math.abs(p - q);
            }
        } else if (map.size() == 3) { // 두 주사위에서 나온 숫자가 p로 같고, 두 주사위에서 나온 숫자가 각각 q와 r일 때
            answer = 1;

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() == 1) {
                    answer *= e.getKey();
                }
            }
        } else if (map.size() == 4) { // 네 주사위에서 나온 숫자가 모두 다를 때
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }

        return answer;
    }
}
