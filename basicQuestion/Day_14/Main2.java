import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 14
 * 5명씩
 */
public class Main2 {
    public static void main(String[] args) {
        String[] result = solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] names) {
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                list.add(names[i]);
            }
        }

        return list.stream().toArray(String[]::new);
    }
}
