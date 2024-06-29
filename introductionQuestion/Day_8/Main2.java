/**
 * 코딩테스트 입문 Day 8 배열, 구현, 수학
 * 외계행성의 나이
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();

        String[] ageArr = String.valueOf(age).split("");
        for (int i = 0; i < ageArr.length; i++) {
            char alphabet = (char) (Integer.parseInt(ageArr[i]) + 'a');
            sb.append(alphabet);
        }

        return sb.toString();
    }
}
