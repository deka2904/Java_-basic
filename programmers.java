import java.util.ArrayList;
import java.util.Arrays;

public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] my_strings = new String[]{"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = new int[][] {{0, 4}, {1, 2}, {3, 5}, {7,7}};
        solution.solution(my_strings, parts);
    }
}

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            answer += str.substring(parts[i][0], parts[i][1] + 1);
        }
        System.out.println(answer);
        return answer;
    }
}