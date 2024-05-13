import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 12
 * 리스트 자르기
 */
public class Main1 {
    public static void main(String[] args) {
        int[] slicer = new int[]{1, 5, 2};
        int[] num_list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = solution(3, slicer, num_list);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(4, slicer, num_list);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        LinkedList<Integer> list = new LinkedList<>();

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n) {
            case 1 :
                for (int i = 0; i <= b; i++) {
                    list.add(num_list[i]);
                }

                break;

            case 2 :
                for (int i = a; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }

                break;

            case 3 :
                for (int i = a; i <= b; i++) {
                    list.add(num_list[i]);
                }

                break;

            case 4 :
                for (int i = a; i <= b; i += c) {
                    list.add(num_list[i]);
                }

                break;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
