import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 17
 * ad 제거하기
 */
public class Main3 {
    public static void main(String[] args) {
        String[] result = solution(new String[]{"and", "notad", "abcd"});

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution(new String[]{"there", "are", "no", "a", "ds"});

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] strArr) {
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }

        return list.stream().toArray(String[]::new);
    }
}
