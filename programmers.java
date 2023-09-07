import java.io.Writer;
import java.util.*;

public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] str_list = new String[]{"abc", "def", "ghi"};
//        int[][] parts = new int[][] {{0, 4}, {1, 2}, {3, 5}, {7,7}};
        int[] num_list = new int[]{2, 1, 6};
//        int[] num_list = new int[]{4, 2, 6, 1, 7, 6};
        solution.solution("abcdevwxyz");
    }
}
class Solution {
    public String solution(String myString) {
        String answer = "";
        char num = 0;
        for (int i = 0; i < myString.length() ; i++) {
            System.out.println(myString.charAt(i));
            if (myString.charAt(i) < 108){
//                num = 108;
//                 = num;
            }
        }
        return answer;
    }
}