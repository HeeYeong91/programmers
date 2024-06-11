/**
 * 코딩 기초 트레이닝 Day 15
 * 1로 만들기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14}));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        boolean flag = false;

        while (!flag) {
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] != 1) {
                    if (num_list[i] % 2 == 0) {
                        num_list[i] = num_list[i] / 2;
                    } else {
                        num_list[i] = (num_list[i] - 1) / 2;
                    }

                    answer++;
                }
            }

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] != 1) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }

        return answer;
    }
}
