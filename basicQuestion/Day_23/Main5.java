import java.time.LocalDate;

/**
 * 코딩 기초 트레이닝 Day 23
 * 날짜 비교하기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
    }

    public static int solution(int[] date1, int[] date2) {
        LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);

        return localDate1.isBefore(localDate2) ? 1 : 0;
    }
}
