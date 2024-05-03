/**
 * 코딩 기초 트레이닝 Day 8
 * 글자 이어 붙여 문자열 만들기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(solution("zpiaz", new int[]{1, 2, 0, 0, 3}));
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }

        return sb.toString();
    }
}
