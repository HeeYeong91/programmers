import java.util.LinkedList;

/**
 * 코딩테스트 입문 Day 13 문자열, 배열, 사칙연산, 수학, 조건문
 * 컨트롤 제트
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        LinkedList<Integer> list = new LinkedList<>();
        String[] strArr = s.split(" ");

        for (String str : strArr) {
            if (str.equals("Z")) {
                list.removeLast();
            } else {
                list.add(Integer.parseInt(str));
            }
        }

        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
