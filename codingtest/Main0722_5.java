/**
 * 코딩테스트 연습 PCCE 기출문제 5번
 * 산책
 */
public class Main0722_5 {
    public static void main(String[] args) {
        int[] result = solution("NSSNEWWN");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution("EESEEWNWSNWWNS");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }

        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
