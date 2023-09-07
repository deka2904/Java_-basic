import java.util.ArrayList;
import java.util.Arrays;

public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
//        int[] array = new int[]{1, 8, 3};
//        String[] arr = new String[]{"a","b","c"};
//        boolean[] finished = new boolean[]{true, false, true, false};
        solution.solution(arr);
    }
}
class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1;
                    System.out.println(answer);
                } else {
                    answer = 0;
                    System.out.println(answer);
                    return answer;
                }
            }
        }
        return  answer;
    }
}