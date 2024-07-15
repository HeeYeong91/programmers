/**
 * 코딩테스트 입문 Day 21 문자열, 사칙연산, 시뮬레이션, 2차원배열, 수학, 배열
 * 안전지대
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(
                solution(
                        new int[][]{
                                {0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0},
                                {0, 0, 1, 0, 0},
                                {0, 0, 0, 0, 0}
                        }
                )
        );
        System.out.println(
                solution(
                        new int[][]{
                                {0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0},
                                {0, 0, 1, 1, 0},
                                {0, 0, 0, 0, 0}
                        }
                )
        );
        System.out.println(
                solution(
                        new int[][]{
                                {1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1}
                        }
                )
        );
    }

    public static int solution(int[][] board) {
        int answer = 0;
        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    checkDanger(i, j, n, board);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void checkDanger(int i, int j, int n, int[][] board) {
        int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dy = {0, 0, 1, -1, 1, 1, -1, -1};

        for (int k = 0; k < 8; k++) {
            int nextX = i + dx[k];
            int nextY = j + dy[k];

            if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                if (board[nextX][nextY] == 0) {
                    board[nextX][nextY] = -1;
                }
            }
        }
    }
}
