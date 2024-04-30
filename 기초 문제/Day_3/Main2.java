/**
 * 코딩 기초 트레이닝 Day 3
 * 문자 리스트를 문자열로 변환하기
 */
public class Main2 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        System.out.println(solution(arr));
    }

    public static String solution(String[] arr) {
        String answer = "";
        for (String s : arr) {
            answer += s;
        }

        return answer;
    }
}
