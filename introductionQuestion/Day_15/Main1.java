import java.util.HashMap;

/**
 * 코딩테스트 입문 Day 15 문자열, 해시, 배열, 수학
 * 영어가 싫어요
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }

    public static long solution(String numbers) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("zero", 0);
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        hashMap.put("six", 6);
        hashMap.put("seven", 7);
        hashMap.put("eight", 8);
        hashMap.put("nine", 9);

        long answer = 0;

        StringBuilder sb = new StringBuilder();
        String[] strArr = numbers.split("");

        for (String str : strArr) {
            if (!hashMap.containsKey(sb.toString())) {
                sb.append(str);

                if (hashMap.containsKey(sb.toString())) {
                    answer = (answer * 10) + hashMap.get(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }

        return answer;
    }
}
