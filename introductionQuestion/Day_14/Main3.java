/**
 * 코딩테스트 입문 Day 14 조건문, 반복문, 시뮬레이션, 문자열
 * 암호 해독
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

     public static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = cipher.split("");

         for (int i = code - 1; i < cipher.length(); i += code) {
             sb.append(strArr[i]);
         }

        return sb.toString();
     }
}
