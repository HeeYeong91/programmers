import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        String[] result = solution("baconlettucetomato");
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution("abcd");
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution("cabab");
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String myStr) {
        LinkedList<String> list = new LinkedList<>();
        String[] result = myStr.split("[abc]");

        for (int i = 0; i < result.length; i++) {
            if (!result[i].isBlank()) {
                list.add(result[i]);
            }
        }

        if (result.length == 0) {
            return new String[]{"EMPTY"};
        } else {
            return list.stream().toArray(String[]::new);
        }
    }
}
