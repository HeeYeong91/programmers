import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 14
 * 할 일 목록
 */
public class Main3 {
    public static void main(String[] args) {
        String[] result = solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }

        return list.stream().toArray(String[]::new);
    }
}
