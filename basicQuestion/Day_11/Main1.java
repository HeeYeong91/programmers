/**
 * 코딩 기초 트레이닝 Day 11
 * 문자 개수 세기
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution("Programmers");

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(String my_string) {
        int size = ('Z' - 'A') + ('z' - 'a') + 2;
        int[] answer = new int[size];

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer[my_string.charAt(i) - 'A']++;
            } else {
                answer[my_string.charAt(i) - 'a' + ('Z' - 'A' + 1)]++;
            }
        }

        return answer;
    }
}
