public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("abcdef", "f");
    }
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String s = "";
        for (int i = 0; i < my_string.length() ; i++) {
            System.out.println(my_string.charAt(i));
            s = String.valueOf(my_string.charAt(i));
            if (s == letter)
                continue;
            answer += s;
        }
        System.out.print(answer);
        return answer;
    }
}
