import java.util.HashMap;

/**
 * 코딩테스트 입문 Day 9 수학, 문자열, 해시, 완전탐색, 조건문
 * 모스부호 (1)
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }

    public static String solution(String letter) {
        HashMap<String, Character> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        char alphabet = 'a';

        for (String s : morse) {
            hm.put(s, alphabet++);
        }

        String[] letterArr = letter.split(" ");
        for (String s : letterArr) {
            sb.append(hm.get(s));
        }

        return sb.toString();
    }
}
