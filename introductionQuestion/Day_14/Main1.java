import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 14 조건문, 반복문, 시뮬레이션, 문자열
 * 가까운 수
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
    }

     public static int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);

         for (int i = 1; i < array.length; i++) {
             if (Math.abs(array[0] - n) > Math.abs(array[i] - n)) {
                 array[0] = array[i];
             }
         }
         answer = array[0];
         
        return answer;
     }
}
