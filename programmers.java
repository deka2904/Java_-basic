import javax.swing.*;
import java.util.Arrays;

public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] array = new int[]{1, 2, 7, 10, 11};
        solution.solution(144);
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        double num = Math.sqrt((double)n);
        if (Math.pow(num, 2) == (double) n){
            answer = 1;
            return answer;
        }else {
            answer = 2;
            return answer;
        }
    }
}