/**
 * 코딩 기초 트레이닝 Day 25
 * 특별한 이차원 배열 2
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(
                solution(new int[][]{
                        {5, 192, 33},
                        {192, 72, 95},
                        {33, 95, 999}}
                )
        );

        System.out.println(
                solution(new int[][]{
                        {19, 498, 258, 587},
                        {63, 93, 7, 754},
                        {258, 7, 1000, 723},
                        {587, 754, 723, 81}}
                )
        );
    }

    public static int solution(int[][] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1;
                } else if (arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }

            if (answer == 0) {
                break;
            }
        }

        return answer;
    }
}
