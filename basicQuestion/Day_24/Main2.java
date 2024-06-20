import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 24
 * 그림 확대
 */
public class Main2 {
    public static void main(String[] args) {
        String[] result = solution(
                new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."},
                2
        );

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution(new String[]{"x.x", ".x.", "x.x"}, 3);

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] picture, int k) {
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = picture[i].split("");

            for (String s : strArr) {
                sb.append(s.repeat(k));
            }

            for (int j = 0; j < k; j++) {
                list.add(sb.toString());
            }
        }

        return list.stream().toArray(String[]::new);
    }
}
