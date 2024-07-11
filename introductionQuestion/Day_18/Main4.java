import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 코딩테스트 입문 Day 18 문자열, 수학, 조건문, 정렬
 * 문자열 정렬하기 (2)
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = my_string.toLowerCase().split("");

        LinkedList<String> list= Stream.of(strArr).collect(Collectors.toCollection(LinkedList::new));
        list.sort(Comparator.naturalOrder());
        list.forEach(sb::append);

        return sb.toString();
    }
}
