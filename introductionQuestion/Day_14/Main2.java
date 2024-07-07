/**
 * 코딩테스트 입문 Day 14 조건문, 반복문, 시뮬레이션, 문자열
 * 369게임
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }

     public static int solution(int order) {
        int answer = 0;
        String[] strArr = String.valueOf(order).split("");
        for (String s : strArr) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }

        return answer;
     }
}
